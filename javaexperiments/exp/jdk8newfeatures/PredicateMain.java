package exp.jdk8newfeatures;

import java.util.function.*;;

public class PredicateMain {

	public static void main(String[] args) {
		IEven even1=(num)->num%2==0;
		boolean result=even1.isEven(4);
		System.out.println("number even="+result);
	
		Predicate<Integer>predicate=(num)->num%2==0;
		boolean result2=predicate.test(6);
		System.out.println("number even="+result2);

	}

}
