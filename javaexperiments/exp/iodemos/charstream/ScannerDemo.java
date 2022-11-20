package exp.iodemos.charstream;
import java.io.*;
import java.util.*;

public class ScannerDemo {
	
	public static void main(String args[]) {
		InputStream inputStream=System.in;
		Scanner scanner=new Scanner(inputStream);
		System.out.println("give an integer");
		int value=scanner.nextInt();
	    System.out.println("integer red="+value); 
	}

}
