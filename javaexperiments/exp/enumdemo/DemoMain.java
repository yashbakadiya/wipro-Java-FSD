package exp.enumdemo;

public class DemoMain {
    public static void main(String args[]){
        DayBreak break1=DayBreak.MorningBreak;
        DayBreak break2=DayBreak.LunchBreak;
        DayBreak break3=DayBreak.MorningBreak;
        boolean isEquals=break1.equals(break3);
        System.out.println("break equals break3 "+isEquals);

        String break1Name=break1.name();
        int break1Ordinal=break1.ordinal();
        System.out.println("break1 name="+break1Name);
        System.out.println("ordinal="+break1Ordinal);
        System.out.println("break1="+break1);

        DayBreak breaks[]=DayBreak.values();
        for(DayBreak iterated:breaks){
            System.out.println(iterated);
        }


    }
}
