package exp.jdk8newfeatures;

import java.util.function.*;

public class ConsumerMain {

	public static void main(String[] args) {
		IPrint printer1 = (input) -> System.out.println(input);
		IPrint printer2 = (input) -> {
			System.out.println("inside printer2");
			System.out.println(input);
		};
		
		printer1.print("hi");
		printer2.print("hello");
		
		Consumer<String> printer3=(input)-> System.out.println(input);
		printer3.accept("bye");
	}

}
