// SPDX-FileCopyrightText: 2006 Benjamin Livshits livshits@cs.stanford.edu
// SPDX-License-Identifier: Apache-2.0

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
   
   $Id: Pred3.java,v 1.5 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.micro.pred;

import org.sosy_lab.sv_benchmarks.Verifier;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description="simple correlated tests" 
 *  @servlet vuln_count = "0" 
 *  */
public class Pred3 extends BasicTestCase implements MicroTestCase {
    private static final String FIELD_NAME = "name";

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        boolean choice = Verifier.nondetBoolean();
        String name = "abc";
        
        if(choice) {
            name = req.getParameter(FIELD_NAME);
        }
        
        if(!choice) {
            PrintWriter writer = resp.getWriter();
            writer.println(name);              /* OK */     // nothing bad gets here
        }
    }

    public String getDescription() {
        return "simple correlated tests";
    }

    public int getVulnerabilityCount() {
        return 0;
    }    
}