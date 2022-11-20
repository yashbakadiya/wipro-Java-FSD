package exp.exceptionsdemo;

public class InvalidCustomerNameException extends Exception{

	public InvalidCustomerNameException(String msg) {
		super(msg);
	}
}
