package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Given an array, print the count of subarrays that has negative sum
public class SubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCnt = sc.nextInt();
        int a[] = new int[inputCnt];
        for(int i=0; i<inputCnt; i++){
            a[i]=sc.nextInt();
        }
        int sum = 0; 
        int cnt=0;
        int k = 0; 
        for(int i=0; i<inputCnt; i++){
              k = i+1;
            for(int j=0; j<inputCnt-i; j++){
                int b[] = Arrays.copyOfRange(a,j,k);
                for(int l = 0; l <b.length; l++){
                    sum += b[l];
                }
                if(sum<0)
                    cnt++;
                sum=0;
                k++;
            }
           
        }
        System.out.println(cnt);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
