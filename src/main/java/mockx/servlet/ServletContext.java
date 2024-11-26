package mockx.servlet;

import org.sosy_lab.sv_benchmarks.Tainting;
import org.sosy_lab.sv_benchmarks.Verifier;

import java.util.*;


public class ServletContext {
    public String getInitParameter(String parameter) {
	parameter = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	return parameter;
    }

    public Enumeration getInitParameterNames() {
	String a = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	String b = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	String c = Tainting.taint(Verifier.nondetString(), Tainting.INTERNAL_INFO);
	List arrayList = new ArrayList();
	arrayList.add(a);
	arrayList.add(b);
	arrayList.add(c);
	Enumeration e = Collections.enumeration(arrayList);
	return e;
    }
    
}
