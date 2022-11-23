/**
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id$
 */
package securibench.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import mockx.servlet.ServletContext;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="use getInitParameterNames" 
 *  @servlet vuln_count = "1" 
 *  */
public class Basic42 extends BasicTestCase implements MicroTestCase {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {        
        ServletContext context = getServletConfig().getServletContext();
        Enumeration e = context.getInitParameterNames();
        while(e.hasMoreElements()) {
            String name = (String) e.nextElement();
            Object value = context.getInitParameter(name); 
            PrintWriter writer = resp.getWriter();
            writer.println(value.toString());          					 /* BAD */
        }
    }
    
    public String getDescription() {
        return "use getInitParameterNames";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}
