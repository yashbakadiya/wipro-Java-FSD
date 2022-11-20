package exp.inheritancedemo;

public class EceStudent extends Student{
    private String device;

    public EceStudent(int id, String name, String device){
        super(id,name);
        this.device=device;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device){
        this.device=device;
    }
}
