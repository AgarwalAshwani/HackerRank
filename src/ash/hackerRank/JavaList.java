package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Java list - Add or delete element from list

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String action="";
        int index;
        int value;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for(int j=0; j<Q; j++){
            action = sc.next();
            if(action.equals("Insert")){
                index = sc.nextInt();
                value = sc.nextInt();
                list.add(index,value);
            }
            if(action.equals("Delete")){
                index = sc.nextInt();
                list.remove(index);
            }
                
        }
        for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        
    }
}
