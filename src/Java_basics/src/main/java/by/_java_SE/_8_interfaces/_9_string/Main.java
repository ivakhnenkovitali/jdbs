package by._java_SE._8_interfaces._9_string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();
        String str3 = new String(new char[]{'h','e','l','l','o'});
        String str4 =new String(new char[] {'w','e','l','c','o','m','e'},3,4);
        String str5= "";
        String str6= null;

        System.out.println(str1);  // Java
        System.out.println(str2);  //
        System.out.println(str3);  //hello
        System.out.println(str4);  //come
        System.out.println(str5);  //
        System.out.println(str6);   //null

        System.out.println(str1.length());  //4

        char [] helloArray = str3.toCharArray();
        System.out.println(Arrays.toString(helloArray));  //[h, e, l, l, o]

        if (str5.length()==0){
            System.out.println("String is empty");
        }

        if (str6==null||str6.length()==0){
            System.out.println("String is empty");
        }

        String str7="Hello world";
        String str8="I work";
        boolean result = str7.regionMatches(6,str8,2,3);
        System.out.println(result);





    }
}
