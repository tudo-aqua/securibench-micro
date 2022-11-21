package mock.io;

import org.sosy_lab.sv_benchmarks.Tainting;


public class FileInputStream {
    private String fileName;

    public FileInputStream(String fileName) {
	this.fileName = fileName;
	Tainting.check(this.fileName, Tainting.FILE_OPERATIONS);
    }


}
