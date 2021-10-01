#!/bin/bash

mkdir securibench

for f in `find src/main/java/securibench/micro | grep java`; do
  ipath=`echo $f | sed -e "s/\.java$//"`
  iname=`echo $ipath | cut -d '/' -f 7`
  if [ -z "$iname" ]; then
    continue
  fi

  safe=`less $f | grep "vuln_count" | grep "\"0\"" | wc -l` 
  verdict=false
  if [ "1" -eq "$safe" ]; then
    verdict=true
  fi

  echo "## Generating: $iname"
  
  cat <<EOT >> securibench/$iname.yml
format_version: "2.0"
input_files:
  - ../common/
  - $iname/
properties:
  - property_file: ../properties/assert.prp
    expected_verdict: $verdict

options:
  language: Java

EOT

  mkdir securibench/$iname
  # cp -a src/main/java/* $iname

  import=`echo $ipath | sed -e "s/\//./g" | sed -e "s/src.main.java.//"`

  cat <<EOT >> securibench/$iname/Main.java
import tools.aqua.concolic.Verifier;
import $import;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;

public class Main {
  
  public static void main(String[] args) {
    String s1 = Verifier.nondetString();
    String s2 = Verifier.nondetString();
    String s3 = Verifier.nondetString();
    HttpServletRequest req = new HttpServletRequest();
    HttpServletResponse res = new HttpServletResponse();

    req.setParameter(s1);
    req.setCookies(new Cookie[] {new Cookie(s2, s3) });

    $iname sut = new $iname();
    try {
      sut.doGet(req, res);
    } 
    catch (IOException e) {

    }
  }
}

EOT

  # javac -cp ../tests:target/securibench-0.1-SNAPSHOT.jar securibench/$iname/Main.java

done