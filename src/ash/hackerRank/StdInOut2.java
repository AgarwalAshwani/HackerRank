package ash.hackerRank;

import java.util.Scanner;

//Practise to read double, int and followed by String 
//(After reading int or double, before reading String we are reading \n. see line 13)
public class StdInOut2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s= scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
