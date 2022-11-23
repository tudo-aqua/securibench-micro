// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

// This file is part of the SV-Benchmarks collection of verification tasks:
// https://gitlab.com/sosy-lab/benchmarking/sv-benchmarks

package mockx.servlet;

import java.io.PrintWriter;
import java.io.IOException;

public interface ServletResponse {
    public PrintWriter getWriter() throws IOException;
}
