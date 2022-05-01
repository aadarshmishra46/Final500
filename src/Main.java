import string.ReverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s="abc";
        String s1=new String("abc");
       final int a=10;
       int b=40;
        if(a==b)
            System.out.println("true");
        if(s==s1){
            System.out.println("yes");
        }
        ReverseString reverseString=new ReverseString();
        reverseString.reverseString(new char[] {'h','e','l','l','o'});
    }
}
