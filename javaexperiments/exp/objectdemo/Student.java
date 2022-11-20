package exp.objectdemo;

public class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "tostring- "+id+"-"+name;
    }
}
