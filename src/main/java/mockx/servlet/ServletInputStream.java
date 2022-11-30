package mockx.servlet;

import java.io.InputStream;

public class ServletInputStream extends InputStream {
    private String string;
    private int position;
    private int mark;
    
    public ServletInputStream(String string) {
	if(string == null) {
	    this.string = "";
	} else {
	    this.string = string;
	}
	this.position = 0;
	this.mark = 0;
    }

    public int available() {
	return string.length() - position;
    }

    public void close(){
	position = string.length();
    }

    public void mark () {
	mark = position;
    }

    public int read() {
	if(position >= string.length()) {
	    return -1;
	} else {
	    // Copies the lower 8-bits of the character into the next byte.
	    // As of 30.11.2022 this is consistent with the behavior of .getBytes().
	    byte nextByte = (byte) string.charAt(position);
	    position++;
	    return nextByte;
	}
    }

    public void reset(){
	position = mark;
    }

    public long skip(long step){
	int maxstep = string.length() - position;
	if(step > maxstep) {
	    position += maxstep;
	    return maxstep;
	} else {
	    position += step;
	    return step;
	}	
    }
    
}
