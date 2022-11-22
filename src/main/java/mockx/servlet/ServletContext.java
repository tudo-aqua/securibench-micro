package mockx.servlet;

import org.sosy_lab.sv_benchmarks.Tainting;

public class ServletContext {
    public String getInitParameter(String parameter) {
	parameter = Tainting.taint(parameter, Tainting.INTERNAL_INFO);
	return parameter;
    }
}
