package exp.objectdemo;

public class StudentMain {

    public static void main(String args[]){
        Student student1 = new Student(1, "lakshmi");
       Object students=student1;

        boolean isObject=student1 instanceof Object;
        System.out.println("is type of Object "+isObject);

        System.out.println(student1);

    }

}
