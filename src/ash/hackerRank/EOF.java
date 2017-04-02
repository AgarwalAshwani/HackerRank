package ash.hackerRank;

import java.util.Scanner;

//Read stdin until EOF

public class EOF {

	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
		        int i = 1;
		        while(sc.hasNextLine()){
		            System.out.println(i++ + " " + sc.nextLine());
		        }
		        sc.close();
	    }

}
