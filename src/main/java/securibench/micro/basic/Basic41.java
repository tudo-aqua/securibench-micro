/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id$
 */
package securibench.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="use getInitParameter instead" 
 *  @servlet vuln_count = "1" 
 *  */
public class Basic41 extends BasicTestCase implements MicroTestCase {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        
        String s = getServletConfig().getServletContext().getInitParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.println(s);           						/* BAD */
    }
    
    public String getDescription() {
        return "use getInitParameter instead";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}
