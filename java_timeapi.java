import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class java_timeapi {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

    //datetime formatter

    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy--E");
    String mydate=dt.format(df);
    System.out.println(mydate);



    }
}
