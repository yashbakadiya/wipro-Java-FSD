package exp.jdk8newfeatures;
import java.util.function.*;

public class BiPredicateMain {
	public static void main(String[] args) {
        ISumEven calculator=(num1,num2)->(num1+num2)%2==0;
        boolean result1=calculator.isSumEven(3, 4);
	   System.out.println("result1="+result1);
        BiPredicate<Integer, Integer>calculator2=(num1,num2)->(num1+num2)%2==0;
        boolean result2=calculator2.test(4, 6);
 	   System.out.println("result2="+result2);

	}
}
