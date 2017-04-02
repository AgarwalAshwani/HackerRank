package ash.hackerRank;

import java.util.Scanner;

//Practise Loops - Print the series as mentioned below for given a, b, t and n
//(a+2pow0.b),(a+2pow0.b+2pow1.b)…

public class Loops2 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int result = a;
	            for(int j=0; j<n; j++){
	            	result = result + (int)(Math.pow(2, j)*b);
	            	System.out.print( result + " ");
	            }
	            System.out.println();
	            
	        }
	        in.close();
	    }

}
