package javax.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;



/**
 *
 * @author falk
 */
public class HttpServletResponse {


    public void addCookie(javax.servlet.http.Cookie userCookie) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean containsHeader(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
    public String encodeURL(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String encodeRedirectURL(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String encodeUrl(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String encodeRedirectUrl(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void sendError(int i, String string) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void sendError(int i) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void sendRedirect(String string) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setDateHeader(String string, long l) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void addDateHeader(String string, long l) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setHeader(String string, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void addHeader(String string, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setIntHeader(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void addIntHeader(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setStatus(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setStatus(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getCharacterEncoding() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getContentType() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(System.out) {

            @Override
            public void println(String x) {
                if ("<bad/>".equals(x)) {
                    assert false;
                }
            }
        };
    }

    public void setCharacterEncoding(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setContentLength(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setContentType(String string) {
        
    }

    public void setBufferSize(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getBufferSize() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void flushBuffer() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void resetBuffer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean isCommitted() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void reset() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setLocale(Locale locale) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Locale getLocale() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
