package exp.jdk8newfeatures;
import java.util.function.*;

public class UnaryOperatorMain {

	public static void main(String[] args) {

		ITwice twicer=(num)->2*num;
		int result1=twicer.twice(2);
		System.out.println("result1="+result1);
		UnaryOperator<Integer> operator=(num)->2*num;
		int result2=operator.apply(3);
		System.out.println("result2="+result2);
	}

}
