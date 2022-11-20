package exp.inheritancedemo;

public class DemoMain {

    public static void main(String args[]) {
        DemoMain demo = new DemoMain();
        Student student1 = new CseStudent(1, "lakshmi", "java");
        Student student2 = new CseStudent(2, "sunny", "c++");
        Student student3 = new EceStudent(3, "shivam", "multimeter");
        Student students[] = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            boolean isEceStudent = student instanceof EceStudent;
            if (isEceStudent) {
                EceStudent eceStudent = (EceStudent) student;
                System.out.println(student.getId() + " " + student.getName() + " " + eceStudent.getDevice());
            }
            boolean isCseStudent = student instanceof CseStudent;
            if (isCseStudent) {
                CseStudent cseStudent = (CseStudent) student;
                System.out.println(student.getId() + " " + student.getName() + " " + cseStudent.getLanguage());
            }
        }

    }



}
