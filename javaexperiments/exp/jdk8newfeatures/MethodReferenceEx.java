package exp.jdk8newfeatures;

import java.util.function.*;
import java.util.*;

public class MethodReferenceEx {

	public static void main(String[] args) {
		CasioCalculator calculator = new CasioCalculator();
		BinaryOperator<Integer> addOperator = calculator::add;
		int addResult = addOperator.apply(5, 7);
		System.out.println("add result=" + addResult);
		Consumer<String> consumer = System.out::println;
		consumer.accept("hello");
      
		BinaryOperator<Integer>multiplyOperator=CasioCalculator::multiply;
		int multiplyResult=multiplyOperator.apply(3, 5);
		System.out.println("multiply result="+multiplyResult);
		
		BiFunction<Integer,String,Student>studentCreator=Student::new;
		Student student=studentCreator.apply(3, "repul");   
		System.out.println("student="+student.getId() +" name="+student.getName());
		
		Supplier<ArrayList<String>>arrayListCreator=ArrayList::new;
		ArrayList<String> list=arrayListCreator.get();
		list.add("good");
		list.add("morning");
		System.out.println(list);
	}

}
