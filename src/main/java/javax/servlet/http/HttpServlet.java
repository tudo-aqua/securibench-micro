package javax.servlet.http;

import java.io.IOException;

import javax.servlet.ServletException;

public abstract class HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
