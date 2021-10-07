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
    
    $Id: Arrays4.java,v 1.3 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.micro.arrays;

import java.io.IOException;
import java.io.PrintWriter;
import mockx.servlet.http.HttpServletRequest;
import mockx.servlet.http.HttpServletResponse;
import securibench.micro.BasicTestCase;
import securibench.micro.MicroTestCase;

/** 
 *  @servlet description = "a test of array indeces" 
 *  @servlet vuln_count = "1" 
 *  */
public class Arrays4 extends BasicTestCase implements MicroTestCase {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        int n = 15432532;
        
        String[] array = new String[10];        
        array[0] = name;
        
        PrintWriter writer = resp.getWriter();
        writer.println(array[n-n]);         /* BAD */
    }
    
    public String getDescription() {
        return "a test of array indeces";
    }
    
    public int getVulnerabilityCount() {
        return 1;
    }
}