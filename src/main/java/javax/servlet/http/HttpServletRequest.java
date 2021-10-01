package javax.servlet.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class HttpServletRequest {

	private Cookie[] cookies = null;
	private HeaderEnumeration headers = null;
	private String header = null;
	private String parameter = null;
	private ParameterMap parameterMap = null;
	private String queryString = null;
	
	private static class HeaderEnumeration implements Enumeration<String> {
		private final Iterator<String> elements;

		private HeaderEnumeration(String[] values) {
			List<String> list = Arrays.<String>asList(values);
			this.elements = list.iterator();
		}

		@Override
		public boolean hasMoreElements() {
			return elements.hasNext();
		}

		@Override
		public String nextElement() {
			return elements.next();
		}
	}

	private static class ParameterMap implements Map<String, String[]> {
		private final String[] values;

		private ParameterMap(String key, String[] values) {
			this.values = values;
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public boolean isEmpty() {
			return values == null;
		}

		@Override
		public boolean containsKey(Object key) {
			return false;
		}

		@Override
		public boolean containsValue(Object value) {
			return false;
		}

		@Override
		public String[] get(Object key) {
			return values;
		}

		@Override
		public String[] put(String key, String[] value) {
			return null;
		}

		@Override
		public String[] remove(Object key) {
			return null;
		}

		@Override
		public void putAll(Map<? extends String, ? extends String[]> m) {
		}

		@Override
		public void clear() {
		}

		@Override
		public Set<String> keySet() {
			return null;
		}

		@Override
		public Collection<String[]> values() {
			return null;
		}

		@Override
		public Set<Entry<String, String[]>> entrySet() {
			return null;
		}

	}

	public void setParameters(String key, String[] values) {
		parameterMap = new ParameterMap(key, values);
	}

	public void setHeaders(String[] values) {
		headers = new HeaderEnumeration(values);
	}

	public void setHeader(String value) {
		header = value;
	}

	public void setParameter(String value) {
		parameter = value;
	}

	public void setCookies(Cookie[] cookies) {
		this.cookies = cookies;
		System.out.println("Cookie added");
	}

	public void setParameterMap(String value, String[] strings) {
		parameterMap = new ParameterMap(value, strings);
	}
	
	public String[] getParameterValues(String string) {
		if(parameterMap != null) {
			return parameterMap.get(string);
		} else {
			return null;
		}
	}
	
	public void setQueryString(String value) {
		this.queryString = value;
	}

	public String getAuthType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Cookie[] getCookies() {
		return cookies;
	}

	public long getDateHeader(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getHeader(String string) {
		return header;
	}

	public Enumeration getHeaders(String string) {
		return headers;
	}

	public Enumeration getHeaderNames() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int getIntHeader(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getMethod() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getPathInfo() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getPathTranslated() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getContextPath() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getQueryString() {
		return queryString;
	}

	public String getRemoteUser() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isUserInRole(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Principal getUserPrincipal() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getRequestedSessionId() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getRequestURI() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public StringBuffer getRequestURL() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getServletPath() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public HttpSession getSession(boolean bln) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public HttpSession getSession() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isRequestedSessionIdValid() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isRequestedSessionIdFromCookie() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isRequestedSessionIdFromURL() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isRequestedSessionIdFromUrl() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Object getAttribute(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Enumeration getAttributeNames() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getCharacterEncoding() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void setCharacterEncoding(String string) throws UnsupportedEncodingException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int getContentLength() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getContentType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getParameter(String string) {
		return parameter;
	}

	public Enumeration getParameterNames() {
		if(headers != null) {
			return headers;
		} else {
			return new HeaderEnumeration(new String[] {});
		}
	}

//	public String[] getParameterValues(String string) {
//		if (parameter != null) {
//			return new String[] { parameter };
//		} else {
//			return null;
//		}
//	}

	public Map getParameterMap() {
		if (parameterMap != null) {
			return parameterMap;
		} else {
			return new ParameterMap(null, null);
		}
	}

	public String getProtocol() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getScheme() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getServerName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int getServerPort() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public BufferedReader getReader() throws IOException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getRemoteAddr() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getRemoteHost() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void setAttribute(String string, Object o) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public void removeAttribute(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Locale getLocale() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public Enumeration getLocales() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public boolean isSecure() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getRealPath(String string) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int getRemotePort() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getLocalName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public String getLocalAddr() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public int getLocalPort() {
		throw new UnsupportedOperationException("Not supported yet.");
	}


}
