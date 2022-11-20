package exp.jdk8newfeatures;

import java.util.function.*;

public class BinaryOperatorMain {
	public static void main(String[] args) {
		IAdd adder = (num1, num2) -> num1 + num2;
		int result1 = adder.add(1, 2);
		System.out.println("result1=" + result1);

		BinaryOperator<Integer> operator = (num1, num2) -> num1 + num2;
		int result2 = operator.apply(2, 3);
		System.out.println("result2=" + result2);

	}

}
