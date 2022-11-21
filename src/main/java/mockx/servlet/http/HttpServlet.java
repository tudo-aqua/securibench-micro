// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

package mockx.servlet.http;

import java.io.IOException;

import mockx.servlet.ServletException;

import org.sosy_lab.sv_benchmarks.Tainting;

public abstract class HttpServlet {

    public class Config {
	public String getInitParameter(String name) {
	    String tainted = Tainting.taint(name, Tainting.SECRET);
	    return tainted;
	}
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public Config getServletConfig() {
	Config config = new Config();
	return config;
    }

}
