package exp.stringdemo;

/**
 * use stringbuffer if two or more threads are changing same object
 */
public class StringBufferEx {
    public static void main(String[] args){
        StringBuffer chain=new StringBuffer();
        chain.append("hi").append("hello");
        System.out.println(chain);

        StringBuilder concatResult=new StringBuilder();
        for(int i=1;i<=10;i++){
            concatResult.append(i);
        }
        System.out.println("concatresult="+concatResult);
    }
}
