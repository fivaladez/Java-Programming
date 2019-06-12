import java.util.*;
import java.text.*;

public class DateTime{

    public static void main (String args[]){
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println("The current date is: " + date.toString());
        // display time and date
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date: ", date);
        System.out.println("\n");

        Date dNow = new Date( );
        SimpleDateFormat ft =
        new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        /* For more info, look for: https://www.tutorialspoint.com/java/java_date_time.htm*/

        System.out.println("Current Date: " + ft.format(dNow));


        SimpleDateFormat ft2 = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft2.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }

        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");

            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

    }
}
