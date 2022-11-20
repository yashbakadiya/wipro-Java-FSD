package exp.methodoverloadingdemo;

public class CalculatorMain {

    public static void main(String args[]){
        Calculator calculator=new Calculator();
        int result1=calculator.add(1,2);
        int result2=calculator.add(3,4,5);
        String result3=calculator.add("hello","world");
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
        System.out.println("result3="+result3);
    }
}
