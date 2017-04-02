package ash.hackerRank;

import java.util.Scanner;
import java.util.regex.*;
//given a regex, validate if it is correct regex

public class PatternSyntaxCheck{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          try{
          Pattern patt = Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(Exception e){
            System.out.println("Invalid");  
          };
             //Write your code
      }
   }
}
