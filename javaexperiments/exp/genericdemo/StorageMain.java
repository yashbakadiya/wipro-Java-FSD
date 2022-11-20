package exp.genericdemo;

public class StorageMain {

	public static void main(String args[]) {
		Storage<String> storage = new Storage<>();
		storage.add("apple");
		String value = storage.getValue();
		System.out.println("value="+value);
	}

}
