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
 */
/**
   @author Benjamin Livshits <livshits@cs.stanford.edu>
   
   $Id: Basic39.java,v 1.2 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/**
 * @servlet description="StringTokenizer test"
 * @servlet vuln_count = "1"
 */
public class Basic39 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";
      
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter(FIELD_NAME);
        StringTokenizer tok = new StringTokenizer(name, "\t");
        while(tok.hasMoreElements()) {
            PrintWriter writer = resp.getWriter();        
            writer.println(tok.nextElement());              /* BAD */    
        }
    }

    public String getDescription() {
        return "StringTokenizer test";
    }

    public int getVulnerabilityCount() {
        return 1;
    }
}