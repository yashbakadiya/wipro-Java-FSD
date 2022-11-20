package exp.jdk8newfeatures;

import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String args[]) {
		IGreet greeter1=()->"welcome";
	    IGreet greeter2=()->{
	    	System.out.println("inside greeter2");
	    	return "Good morning";
	    };
	    
	  
	    String msg1=greeter1.greet();
	    String msg2=greeter2.greet();
	    System.out.println("msg1="+msg1);
	    System.out.println("msg2="+msg2);
	    
	    Supplier<String>greeter3=()->"good afternoon";
	    String msg3=greeter3.get();
	    System.out.println("msg3="+msg3);
	    
	}
	
}
