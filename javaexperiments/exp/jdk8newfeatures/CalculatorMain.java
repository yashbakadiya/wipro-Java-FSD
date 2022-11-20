package exp.jdk8newfeatures;

public class CalculatorMain {

	public static void main(String args[]) {
		ICalculator calcy1=new ICalculator() {			
			
			@Override
			public int sub(int num1, int num2) {
				return num1-num2;
			}
		};		
		
		int sum1=calcy1.add(2,3);
	    int sub1=calcy1.sub(10, 6);
	    System.out.println("sum="+sum1+" sub1="+sub1);
	    
	    ICalculator calcy2=(num1, num2)->num1-num2;
	    int sub2=calcy2.sub(15, 7);
	    int sum2=calcy2.add(3,5);
	    System.out.println("sum="+sum2+" sub2="+sub2);

	    ICalculator calcy3=(num1,num2) ->{
	    	int result=num1+num2;
	    	return result;
	    };
	    int sub3=calcy3.sub(7, 5);
	    System.out.println(" sub3="+sub3);

	    
	}
	
}
