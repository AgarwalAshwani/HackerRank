package ash.hackerRank;

import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        String res = A.compareTo(B)>0?"Yes":"No";
        System.out.println(res);
String first = String.valueOf(A.charAt(0)).toUpperCase().concat(A.substring(1,A.length()));
        String second = String.valueOf(B.charAt(0)).toUpperCase().concat(B.substring(1,B.length()));
        System.out.println(first + " " + second);
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
    }
}
