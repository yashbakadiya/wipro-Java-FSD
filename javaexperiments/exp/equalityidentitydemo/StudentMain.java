package exp.equalityidentitydemo;

public class StudentMain {
	public static void main(String args[]) {
		Student student1=new Student(1,"roshi");
		Student student2=new Student(1,"roshi");
		boolean isSame=student1==student2;
		System.out.println("is same="+isSame);
		boolean isEquals=student1.equals(student2);
		System.out.println("is equals="+isEquals);
	}

}
