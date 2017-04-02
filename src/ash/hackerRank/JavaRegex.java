package ash.hackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//Given string validate if it is correct IP format (255.255.255.255)
class JavaRegex{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    public String pattern = "((0?\\d?\\d).|(1\\d\\d).|(2[0-5][0-5]).){3}((0?\\d?\\d)|(1\\d\\d)|(2[0-5][0-5]))";
    
}

