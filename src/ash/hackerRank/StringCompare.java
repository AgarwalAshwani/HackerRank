package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Given a string print lexicographically smallest and largest substring of length k
public class StringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Integer len = scan.nextInt();
        scan.close();
        String min = str.substring(0,len);
        String max = str.substring(0,len);
        for(int i=0;i<=(str.length()-len);i++){
            if(min.compareTo(str.substring(i,len+i))>0)
                min = str.substring(i,len+i);
            if(max.compareTo(str.substring(i,len+i))<0)
                max = str.substring(i,len+i);
        }
        System.out.println(min);
        System.out.println(max);
        
    }
}
