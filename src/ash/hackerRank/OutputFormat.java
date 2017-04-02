package ash.hackerRank;

import java.util.Scanner;

//Practise output formattng using System.out.printf()

public class OutputFormat {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(i<=1){
            sc.nextLine();                    
            }
            System.out.printf("%-15s", s1);
            System.out.printf("%03d%n",x);
            //Complete this line
        }
        System.out.println("================================");
    sc.close();

}

}
