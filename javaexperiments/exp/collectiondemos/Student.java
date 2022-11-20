package exp.collectiondemos;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//
	// Student student1=new Student(1,"roshi");
	// Student student2=new Student(1,"roshi");
	// student1.equals(student2)
	//
	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}
		if (arg == null || !(arg instanceof Student)) {
			return false;
		}

		Student that = (Student) arg;
		return this.id == that.id;
	}

	/**
	 * if 2 objects have different hashcode, then objects are not equal if 2 objects
	 * have same hashcode then objects may or may not be equal if 2 objects are
	 * equal, they will have same hashcode
	 */
	@Override
	public int hashCode() {
		return id;
	}

}
