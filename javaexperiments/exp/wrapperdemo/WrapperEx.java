package exp.wrapperdemo;

public class WrapperEx{

public static void main(String args[])
{
 Integer i1=10;
 String i1Str=i1.toString(); 

int i2=10;
Integer i3=i2;

Integer i4=new Integer(8);
int i5=i4;
Integer i6=new Integer(5);

Integer sum=i4+i6;

System.out.println("i1="+i1);
System.out.println("i1Str="+i1Str);
System.out.println("i5="+i5);
System.out.println("i6="+i6);
System.out.println("sum="+sum);


}


}
