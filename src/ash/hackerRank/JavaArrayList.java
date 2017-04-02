package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//First input will be number of lines n, then in next n line first int x will be number of int in that line followed by x integer.
//then next input will be q for number of queries and next q line will be input in x y which means print yth int from xth line
public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner sc = new Scanner(System.in);
          int numOfArray = sc.nextInt();
          int d = 0;
          ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
          for(int i = 0; i<numOfArray; i++){
              d = sc.nextInt();
              Integer[] arr = new Integer[d];
              for(int j =0; j<d; j++){
                  arr[j] = sc.nextInt();
              }
              arrayList.add(arr);
          }
          int q = 0; 
          q = sc.nextInt();
          for(int i = 0; i<q;  i++){
        	  int x = sc.nextInt();
        	  int y = sc.nextInt(); 
        	 try{
        	  System.out.println(arrayList.get(x-1)[y-1]);
        	  }catch(Exception e){System.out.println("ERROR!");};
        	 
          }
    }
}
