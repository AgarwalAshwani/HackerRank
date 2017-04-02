package ash.hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Practise static Block

public class StaticBlock {
	 static Integer B;
	 static Integer H;
	 static boolean flag = true;
	
	static{
	    Scanner s = new Scanner(System.in);
	    B = s.nextInt();
	    H = s.nextInt();
	    s.close();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
