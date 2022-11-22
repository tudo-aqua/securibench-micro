// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

package mockx.servlet.http;

import mockx.servlet.ServletResponse;
import org.sosy_lab.sv_benchmarks.Tainting;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletResponse implements ServletResponse {

  public void sendRedirect(String string) throws IOException {
    checkNoSymbolic(string);
  }

  public PrintWriter getWriter() throws IOException {
    return new PrintWriter(System.out) {
      @Override
      public void println(String x) {
        checkNoSymbolic(x);
      }

      @Override
      public void println(Object x) {
        checkNoSymbolic(x);
      }
    };
  }

  public void setContentType(String s) {
    checkNoSymbolic(s);
  }

  private void checkNoSymbolic(Object s) {
    if (s != null) {
	Tainting.check(s, Tainting.XSS);
	Tainting.check(s, Tainting.INTERNAL_INFO);
    }
  }
}
