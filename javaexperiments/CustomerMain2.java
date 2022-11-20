public class CustomerMain2 {

    public static void main(String args[]){
        Customer array[]=new Customer[2];
        Customer customer1=new Customer();
        customer1.name="ajay";
        customer1.id=11;
        customer1.age=21;

        array[0]=customer1;

        Customer customer2=new Customer();
        customer2.id=2;
        customer2.name="shariq";
        customer2.age=22;

        array[1]=customer2;

        for(int i=0;i<array.length;i++) {
            Customer iterated=array[i];
            int id=iterated.id;
            String name=iterated.name;
            int age=iterated.age;
            System.out.println("customer details=" + id + "," + name + "," + age);
        }
    }
}
