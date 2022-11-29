package mockx.servlet;

import java.io.InputStream;

public class ServletInputStream {
    private bytes[] string;
    private int position;
    private int mark;
    
    public ServletInputStream(String string) {
	if(string == null) {
	    this.string = new byte[0];
	} else {
	    this.string = string.getBytes();
	}
	this.position = 0;
	this.mark = 0;
    }

    public int available() {
	return string.length - position;
    }

    public void close(){
	position = string.length;
    }

    public void mark () {
	mark = position;
    }

    public int read() {
	if(position >= string.length) {
	    return -1;
	} else {
	    byte nextByte = string[position];
	    position++;
	    return nextByte;
	}
    }

    public void reset(){
	position = mark;
    }

    public long skip(long step){
	int maxstep = string.length - position;
	if(step > maxstep) {
	    position += maxstep;
	    return maxstep;
	} else {
	    position += step;
	    return step;
	}	
    }
    
}
