// SPDX-FileCopyrightText: 2021 Falk Howar falk.howar@tu-dortmund.de
// SPDX-License-Identifier: Apache-2.0

package mockx.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletResponse {

    public void sendRedirect(String string) throws IOException {
        checkNoSymbolic(string);
    }

    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(System.out) {
            @Override
            public void println(String x) {
                checkNoSymbolic(x);
            }
        };
    }

    public void setContentType(String s) {
        checkNoSymbolic(s);
    }

    private void checkNoSymbolic(String s) {
        if (s != null && s.contains("<bad/>")) {
            assert false;
        }
    }

}
