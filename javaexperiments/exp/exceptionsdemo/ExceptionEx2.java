package exp.exceptionsdemo;

public class ExceptionEx2 {

	Customer store[] = new Customer[5];

	int index;

	public static void main(String args[]) {
		int id = 1;
		String name = "";
		ExceptionEx2 demo = new ExceptionEx2();
		try {
		demo.register(id, name);
		}
		catch(InvalidCustomerIdException  e) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
		catch( InvalidCustomerNameException e ) {
			String msg=e.getMessage();
			System.out.println(msg);
		}
	
		finally {
			demo.closeConnection();
			
		}
		
		demo.displayAll();
	}

	void closeConnection() {
		System.out.println("close connection");
	}
	
	void register(int id, String name) throws InvalidCustomerNameException{
		if (id <= 0) {

			InvalidCustomerIdException ex = new InvalidCustomerIdException("id is invalid");
			throw ex;
		}
		if (name == null || name.isEmpty()) {

			throw new InvalidCustomerNameException("invalid name");
		}
		System.out.println("about to add customer in store");
		Customer customer = new Customer(id, name);
		store[index] = customer;
		index++;
		
	}

	void displayAll() {
		System.out.println("displaying all customers");
		for (Customer customer : store) {
			if (customer != null) {
				System.out.println("customer " + customer.getId() + " name=" + customer.getName());
			}
		}
	}

}
