package exp.jdk8newfeatures;

import java.util.function.*;

public class BiConsumerMain {
	
	public static void main(String args[]) {
		IPrintConcat printer1=(input, times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			System.out.println(result);
		};
		
		printer1.concat("hi",3);
		
		BiConsumer<String, Integer> printer2=(input, times)->{
			String result="";
			for(int i=0;i<times;i++) {
				result=result+input;
			}
			System.out.println(result);
		};
		printer2.accept("hello", 2);
		
	}

}
