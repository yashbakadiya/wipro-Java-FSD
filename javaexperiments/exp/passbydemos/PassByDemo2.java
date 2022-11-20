package exp.passbydemos;

public class PassByDemo2 {

    public static void main(String args[]){
        Employee employee = new Employee(1,"aditya");
        PassByDemo2 demo=new PassByDemo2();
        demo.display(employee);
        System.out.println("inside main "+employee.id+" "+employee.name);
    }

    void display(Employee employee){
        employee.id=2;
        employee.name="shivam";
        System.out.println("inside display "+employee.id+" "+employee.name);
    }
}
