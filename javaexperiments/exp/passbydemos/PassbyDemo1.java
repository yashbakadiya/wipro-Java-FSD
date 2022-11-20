package exp.passbydemos;

public class PassbyDemo1 {

    public static void main(String args[]) {
        int count = 10;
        PassbyDemo1 demo = new PassbyDemo1();
        demo.increment(count);
        System.out.println("inside main count="+count);
    }

    void increment(int count) {
        count++;
        System.out.println("inside increment count="+count);
    }
}
