package mock.io;

import org.sosy_lab.sv_benchmarks.Tainting;


public class File {
    private String fileName;

    public File(String fileName) {
	this.fileName = fileName;
    }

    public void createNewFile(){
	Tainting.check(this.fileName, Tainting.FILE_OPERATIONS);
    }

}
