package exp.stringdemo;

public class MatchEx {
    public static void main(String args[]){
        String str="abc";
        boolean equals =str.matches("\\D+");
        System.out.println(equals);
    }
}
