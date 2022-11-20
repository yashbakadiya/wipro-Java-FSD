public class CustomerMain1 {

    public static void main(String args[]){
        Customer customer1=new Customer();
        customer1.name="ajay";
        customer1.id=11;
        customer1.age=21;

        customer1.incrementAge();

        Customer customer2=new Customer();
        customer2.id=2;
        customer2.name="shariq";
        customer2.age=22;
        customer2.incrementAge();

        int customer1Id=customer1.id;
        String customer1Name=customer1.name;
        int customer1Age=customer1.age;


        int customer2Id=customer2.id;
        String customer2Name=customer2.name;
        int customer2Age=customer2.age;

        System.out.println("customer 1 details="+customer1Id+","+customer1Name+","+customer1Age);
        System.out.println("customer 2 details="+customer2Id+","+customer2Name+","+customer2Age);

    }
}
