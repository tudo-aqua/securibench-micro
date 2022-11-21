package mock.io;

import org.sosy_lab.sv_benchmarks.Tainting;


public class FileWriter {
    private String fileName;

    public FileWriter(String fileName) {
	this.fileName = fileName;
	Tainting.check(this.fileName, Tainting.FILE_OPERATIONS);
    }

}
