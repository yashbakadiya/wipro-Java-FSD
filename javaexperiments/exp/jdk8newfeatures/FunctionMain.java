package exp.jdk8newfeatures;

import java.util.function.*;

public class FunctionMain {

	public static void main(String args[]) {
		ISquare square=(num)->num*num;
		double result1=square.square(3);
		System.out.println("result1="+result1);
	
		
		Function<Integer,Double>square2=(num)->(double)(num*num);
		double result2=square2.apply(5);
		System.out.println("result2="+result2);

		Function<Integer,Double>square3=(num)->{
			double result=num*num;
			return result;
		};
		double result3=square3.apply(2);
		System.out.println("result3="+result3);
		
	}
}
