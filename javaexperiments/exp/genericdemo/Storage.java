package exp.genericdemo;

public class Storage<T> {
	private T  value;

	public void add(T e){
		this.value=e;
	}
	
	public T getValue() {
		return value;
	}
	
}
