/*
   Copyright 2006 Benjamin Livshits

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 *//**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Aliasing3.java,v 1.1 2006/04/21 17:14:27 livshits Exp $

    changed by Falk Howar: no vulnerability    
 */
package securibench.micro.aliasing;

import java.io.IOException;
import java.io.PrintWriter;

import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;

import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="simple aliasing of an array element" 
 *  @servlet vuln_count = "0" 
 *  */
public class Aliasing3 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       String name = req.getParameter(FIELD_NAME);
       String[] a = new String[10];
       String str = a[5];
       a[5] = name;
       name = str;
              
       PrintWriter writer = resp.getWriter();
       writer.println(str);                              /* BAD */
    }
    
    public String getDescription() {
        return "simple aliasing of an array element";
    }
    
    public int getVulnerabilityCount() {
        return 0;
    }
}