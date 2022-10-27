import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class time_date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365 );
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());//this object will provide the time in milesecond .
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.HOUR));
        GregorianCalendar g= new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));
        System.out.println( TimeZone.getAvailableIDs()[5]);
        System.out.println( TimeZone.getAvailableIDs()[8]);

        }
}
