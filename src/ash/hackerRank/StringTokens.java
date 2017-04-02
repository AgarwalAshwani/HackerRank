package ash.hackerRank;

import java.io.*;
import java.util.*;
//For a given string just print characters and no spaces or other non [A-Za-z] characters
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
         if(s.trim().isEmpty()){
	        	System.out.println(0);
	        }
	        else{
	       String []res1 = s.trim().split("[!\\,?\\._\\'@\\s]+");
	       System.out.println(res1.length);
	        for(int i=0; i<res1.length; i++){
	        	System.out.println(res1[i]);
	        }
	        }
    }
}
