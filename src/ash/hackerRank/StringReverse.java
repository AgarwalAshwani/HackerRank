package ash.hackerRank;

import java.io.*;
import java.util.*;
//Print if given string is palindrome or not
public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        for(int i = A.length()-1; i>=0;i--){
            rev+= A.charAt(i);
        }
        if(rev.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
