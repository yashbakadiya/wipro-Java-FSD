package exp.stringdemo;

/**
 * Use stringbuilder if only single thread is ignore the object
 */
public class StringBuilderEx {
    public static void main(String[] args){
        StringBuilder chain=new StringBuilder();
        chain.append("hi").append("hello");
        System.out.println(chain);
        StringBuilder concatResult=new StringBuilder();
        for(int i=1;i<=10;i++){
            concatResult.append(i);
        }
        System.out.println("concatresult="+concatResult);
    }
}
