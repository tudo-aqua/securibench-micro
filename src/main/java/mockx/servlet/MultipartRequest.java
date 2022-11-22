package mockx.servlet;

import mockx.servlet.http.HttpServletRequest;

public class MultipartRequest {

    private HttpServletRequest inner;

    public MultipartRequest(HttpServletRequest req, String env) {
	this.inner = req;
    }

    public String getParameter(String fieldname) {
	return this.inner.getParameter(fieldname);
    }
}
