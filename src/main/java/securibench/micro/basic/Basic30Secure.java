// SPDX-FileCopyrightText: 2006 Benjamin Livshits livshits@cs.stanford.edu
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks
/**
   @author Benjamin Livshits <livshits@cs.stanford.edu>
   
   $Id: Basic30.java,v 1.3 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/**
 * @servlet description="field sensitivity"
 * @servlet vuln_count = "0"
 */
public class Basic30Secure extends BasicTestCase implements MicroTestCase {
    class Data {
        String value1;
        String value2;
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        Data d = new Data();
        d.value2 = name;
        d.value1 = "abc";
        
        PrintWriter writer = resp.getWriter();
        writer.println(d.value1);                   /* OK */

    }

    public String getDescription() {
        return "field sensitivity";
    }

    public int getVulnerabilityCount() {
        return 0;
    }
}
