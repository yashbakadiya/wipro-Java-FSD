package calcy;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calcy=new Calculator();
	    int input1=-2, input2=-5;
	    int result=calcy.add(input1, input2);
        System.out.println(result);
	}

}
