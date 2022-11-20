package exp.methodoverloadingdemo;



public class Calculator {

    int add(int num1, int num2){
     return num1+num2;
    }

    int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    String add(String str1, String str2){
        return str1+str2;
    }

    int sub(int num1,int num2){
        return num1-num2;
    }

}
