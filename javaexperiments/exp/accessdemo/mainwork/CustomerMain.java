package exp.accessdemo.mainwork;

import exp.accessdemo.Customer;

public class CustomerMain {

    public static void main(String args[]){
        Customer customer=new Customer(1, "aditya");
        int id=customer.getId();
        String name=customer.getName();
        customer.setName("adityaa");
    }
}
