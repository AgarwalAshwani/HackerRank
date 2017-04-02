package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//validate username complies with the format (can contain alphanumeric and _, should begin with char, and length should be between 8 and 30)
public class JavaRegex3 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String username = in.nextLine();
         String pattern = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}$";
         Pattern r = Pattern.compile(pattern);
         Matcher m = r.matcher(username);
          
         if (m.find( )) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
   }
}
