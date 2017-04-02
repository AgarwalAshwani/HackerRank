package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Given array of int 0,1; check if game can be won
//game rule is you can move one step forward, one step backward of jump m step such that you land on 0 or outside array
//if no move then you losse
public class Java1DArray2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int testCase = 0; testCase < T; testCase++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            /* Create array of values */
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            
            System.out.println(solvable(array, m, 0) ? "YES" : "NO");
        }
    }
    
    /* Basically a depth-first search (DFS). 
       Marks each array value as 1 when visiting (Side-effect: alters array) */
    private static boolean solvable(int [] array, int m, int i) {
        /* Base Cases */
        if (i < 0 || array[i] == 1) {
            return false;
        } else if (i + 1 >= array.length || i + m >= array.length) {
            return true;
        }
        
        array[i] = 1; // marks as visited

        /* Recursive Cases */
        return solvable(array, m, i - 1) || 
               solvable(array, m, i + 1) || 
               solvable(array, m, i + m);
    }
}
