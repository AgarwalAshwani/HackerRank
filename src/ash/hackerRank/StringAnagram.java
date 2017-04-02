package ash.hackerRank;

import java.io.*;
import java.util.*;

//given two string print if they are anagram or not

public class StringAnagram {
	static boolean isAnagram(String a, String b) {
        String arra = a.toUpperCase();
        String arrb = b.toUpperCase();
        char arrayA[] = arra.toCharArray();
        char arrayB[] = arrb.toCharArray();
        char temp;
        boolean flag = true;
        
        if(arrayA.length==arrayB.length){
        	for(int i=0; i< b.length(); i++){
	        	for(int j=i+1; j<b.length(); j++){
	        		if(arrayB[i]>arrayB[j]){
	        			temp = arrayB[i];
	        			arrayB[i] = arrayB[j];
	        			arrayB[j] = temp;
	        		}
	        	}
        	}
	        for(int i=0; i< a.length(); i++){
	        	for(int j=i+1; j<a.length(); j++){
	        		if(arrayA[i]>arrayA[j]){
	        			temp = arrayA[i];
	        			arrayA[i] = arrayA[j];
	        			arrayA[j] = temp;
	        		}
	        	}
        	}
	       
	        for(int i=0; i<arrayA.length; i++){
	        	if(arrayA[i]!=arrayB[i]){
	        		flag = false;
	        		break;
	        	}
	        }
	        return flag;
        }
        else{
        	return false;
        }
    
	}
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}