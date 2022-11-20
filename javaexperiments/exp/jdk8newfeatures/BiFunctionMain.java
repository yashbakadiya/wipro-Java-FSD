package exp.jdk8newfeatures;

import java.util.function.*;

public class BiFunctionMain {

	public static void main(String[] args) {
       IConcat concat1=(input,times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			return result;
		};
		String concatResult1=concat1.concat("hi", 2);
	    System.out.println("result="+concatResult1);  
	    
	    BiFunction<String,Integer,String>concat2=(input,times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			return result;
		};
		String concatResult2=concat2.apply("hello", 2);
	    System.out.println("result2="+concatResult2);  
	}

}
