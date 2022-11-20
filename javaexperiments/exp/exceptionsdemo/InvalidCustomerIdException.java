package exp.exceptionsdemo;

public class InvalidCustomerIdException extends RuntimeException{

	public InvalidCustomerIdException(String msg) {
		super(msg);
	}

}
