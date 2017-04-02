package ash.hackerRank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Given date, print day of the week 

public class DateAndTime {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        try{
	         String inputDateStr = String.format("%s/%s/%s", day, month, year);
	        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(inputDate);
	        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	        System.out.println(dayOfWeek);
	        }
	        catch(Exception e){};
	    }

}
