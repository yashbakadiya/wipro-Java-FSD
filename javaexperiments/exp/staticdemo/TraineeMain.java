package exp.staticdemo;

public class TraineeMain {

    public static void main(String[] args){
        Trainee trainee1=new Trainee(1,"aditya");
        Trainee trainee2=new Trainee(2,"vikram");
        Trainee trainee3=new Trainee(3,"lakshmi");
        TraineeMain demo=new TraineeMain();
        demo.displayTrainee(trainee1);
        demo.displayTrainee(trainee2);
        demo.displayTrainee(trainee3);
    }

    void displayTrainee(Trainee trainee){
        System.out.println("trainee "+trainee.id +" name"+trainee.name);
    }
}
