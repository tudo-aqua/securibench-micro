package javax.servlet.http;


public class Cookie {
    
	private String name;
	private String value;
	
	
    public Cookie(String name, String value) {
        this.name = name;
        this.value = value;
        
    }

	public void setMaxAge(int i) {
		
	}

	public void setSecure(boolean b) {
		
	}

	public void setPath(String requestURI) {
		
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
    
}
