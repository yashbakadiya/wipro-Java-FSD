package exp.stringdemo;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";
        boolean isSame = str1 == str2;
        System.out.println(isSame);
        boolean isEmpty = str1.isEmpty();
        String str3 = str1.concat("bye");
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3="+str3);
        int str1Length = str1.length();
        System.out.println("strin1 length=" + str1Length);
        char index2Char = str1.charAt(2);
        System.out.println("char at index 2=" + index2Char);

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.println("character at index =" + ch);
        }

        char array[] = str1.toCharArray();

        String stringWithWhiteSpace = " hi ";
        String stringWithoutEmptySpace = stringWithWhiteSpace.trim();
        System.out.println("string with white space length =" + stringWithWhiteSpace.length());
        System.out.println("string without whiteout space=" + stringWithoutEmptySpace.length());

        int elStartIndex = str1.indexOf("el");
        System.out.println("el startindex in hello=" + elStartIndex);

        String str4 = str1.replace("el", "ii");
        System.out.println("replaced el with ii=" + str4);

        boolean elContains = str1.contains("el");
        System.out.println("el contains in str1=" + elContains);

        boolean startsWith = str1.startsWith("he");
        System.out.println("st1 starts with he=" + startsWith);

        //substring starting at index 2
        String substring1 = str1.substring(2);
        System.out.println("substrin1=" + substring1);
        String substring2 = str1.substring(0, 2);
        //substring starting at index 0 and ending at index 2, char at index2 not part of substring
        System.out.println("bustring2="+substring2);
        String str5="hello,good,morning";
        String parts[]=str5.split(",");
        System.out.println("parts length="+parts.length);
        for (String part:parts){
            System.out.println("part="+part);
        }
    }
}
