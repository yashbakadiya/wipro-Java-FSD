package exp.staticdemo;

public class Trainee {

    int id;
    String name;
    int count;

    public Trainee(int id, String name){
        this.id=id;
        this.name=name;
        count++;
    }

    int getCount(){
        return count;
    }

    static void displayCount(Trainee trainee){
        System.out.println("count="+trainee.count);
    }

}
