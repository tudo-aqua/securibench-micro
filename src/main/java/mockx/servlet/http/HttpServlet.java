// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

package mockx.servlet.http;

import java.io.IOException;

import java.util.*;

import mockx.servlet.ServletException;

import org.sosy_lab.sv_benchmarks.Tainting;
import org.sosy_lab.sv_benchmarks.Verifier;

public abstract class HttpServlet {

    public class Context {
	public String getInitParameter(String parameter) {
	    parameter = Tainting.taint(parameter, Tainting.INTERNAL_INFO);
	    return parameter;
	}
    }
    
    public class Config {
	public String getInitParameter(String parameter) {
	    parameter = Tainting.taint(parameter, Tainting.INTERNAL_INFO);
	    return parameter;
	}

	public Context getServletContext() {
	    Context context = new Context();
	    return context;
	}

	public Enumeration getInitParameterNames() {
	    String a = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	    String b = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	    String c = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	    List arrayList = new ArrayList();
	    arrayList.add(a);
	    arrayList.add(b);
	    arrayList.add(c);
	    Enumeration e = Collections.enumeration(arrayList);
	    return e;
	}
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public Config getServletConfig() {
	Config config = new Config();
	return config;
    }

}
