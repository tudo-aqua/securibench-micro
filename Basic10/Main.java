import tools.aqua.concolic.Verifier;
import securibench.micro.basic.Basic10;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main {
  
  public static void main(String[] args) {
    String s = Verifier.nondetString();
    HttpServletRequest req = new HttpServletRequest();
    HttpServletResponse res = new HttpServletResponse();

    req.setParameter(s);

    Basic10 sut = new Basic10();
    try {
      sut.doGet(req, res);
    } 
    catch (IOException e) {

    }
  }
}
