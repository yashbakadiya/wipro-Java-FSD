package exp.interfacedemo;

public class NiitMain {

    public static void main(String[] args){
        ICalculator calcy=new WiproCalculator();
        int result=calcy.add(1,2);
        System.out.println("result="+result);
    }
}
