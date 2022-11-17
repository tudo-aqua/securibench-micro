// SPDX-FileCopyrightText: 2006 Benjamin Livshits livshits@cs.stanford.edu
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

/*
    @author Benjamin Livshits <livshits@cs.stanford.edu>
    
    $Id: Basic12.java,v 1.4 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.micro.basic;

import org.sosy_lab.sv_benchmarks.Verifier;
import java.io.IOException;
import java.io.PrintWriter;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="a simple conditional; both branches should be taken" 
 *  @servlet vuln_count = "0" 
 **/
public class Basic12Secure extends BasicTestCase implements MicroTestCase {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String s1 = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        boolean choice = Verifier.nondetBoolean();
        
        if(choice) {

        } else{
        
        }
        
        writer.println("\n");           /* OK */
    }
    
    public String getDescription() {
        return "a simple conditional; both branches should be taken";
    }
    
    public int getVulnerabilityCount() {
        return 0;
    }
}
