package ash.hackerRank;

import java.util.*;
//Java Stack
class JavaStack{
   
   public static void main(String []argh)
   {
     Scanner sc = new Scanner(System.in);
		 Stack<String> stack = new Stack<String>(); 
		 String popped = "";
		 boolean completed = false;
	      while (sc.hasNext()) {
	         String input=sc.next();
	         completed = false;
	         stack.removeAllElements();
	         for(int i=0; i<input.length(); i++){
	        	 if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '['){
	        		 stack.push(String.valueOf(input.charAt(i)));
	        	 }
	        	 else{
	        		 if(!stack.isEmpty()){
	        			 popped = stack.pop();
	        			 if(input.charAt(i)==')'){
	        				 if(popped.equals("(")){
	        					 if(stack.isEmpty() && i==input.length()-1){
	        						 System.out.println("true");
	        						 completed = true;
		        					 break; 
	        					 } 
	        				 }
	        				 else{
	        					 System.out.println("false");
	        					 completed = true;
	        					 break;
	        				 }
	        			 }
	        			 if(input.charAt(i)=='}'){
	        				 if(popped.equals("{")){
	        					 if(stack.isEmpty() && i==input.length()-1){
	        						 System.out.println("true");
	        						 completed = true;
		        					 break; 
	        					 } 
	        				 }
	        				 else{
	        					 System.out.println("false");
	        					 completed = true;
	        					 break;
	        				 }
	        			 }
	        			 if(input.charAt(i)==']'){
	        				 if(popped.equals("[")){
	        					 if(stack.isEmpty() && i==input.length()-1){
	        						 System.out.println("true");
	        						 completed = true;
		        					 break; 
	        					 } 
	        				 }
	        				 else{
	        					 System.out.println("false");
	        					 completed = true;
	        					 break;
	        				 }
	        			 }
	        		 }
	        		 else{
	        			 System.out.println("false");
	        			 completed = true;
	        			 break;
	        		 }
	        	 }
	         }
	         if(!completed)
	        	 System.out.println("false");
	         
	      }
	      
      
   }
}
