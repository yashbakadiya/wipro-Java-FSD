package exp.exceptionsdemo;

public class ExceptionEx1 {

	public static void main(String args[]) {
		ExceptionEx1 demo = new ExceptionEx1();
		Customer customer = demo.fetchCustomerDetails();
		System.out.println("**customer fetched from server");
		try {
		demo.display(customer);
		}catch(InvalidCustomerArgException e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
		System.out.println("after display");
		System.out.println("bye, exiting from application");
	}

	Customer fetchCustomerDetails() {
		Customer customer = null;
		return customer;
	}

	void display(Customer customer) {
		if(customer==null) {
			throw new InvalidCustomerArgException("customer arg is null");
		}
		System.out.println("inside display");
		System.out.println(customer.getId() + " name=" + customer.getName());
		System.out.println("customer displayed");

	}
}
