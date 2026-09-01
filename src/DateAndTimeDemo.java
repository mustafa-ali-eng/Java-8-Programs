
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class DateAndTimeDemo {

    public static void main(String[] args) throws ParseException {

        Date d = new Date();
        System.out.println(d);


     // Converting Date to String
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf1.format(d);
        System.out.println(date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        String date2 = sdf2.format(d);
        System.out.println(date2);

        // Convert String to Date
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf3.parse("2024-06-10");
        System.out.println(parse);


        // Java 1.8 Date API Example

        LocalDate of = LocalDate.of(2024, 6, 10);
        System.out.println(of);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        today = today.plusDays(3);
        System.out.println(today);

        today = today.plusMonths(2);
        System.out.println(today);

        today = today.plusYears(1);
        System.out.println(today);


        LocalTime now = LocalTime.now();
        System.out.println(now);

        now = now.plusHours(2);
        System.out.println(now);

        now = now.plusMinutes(3);
        System.out.println(now);
        now = now.plusSeconds(4);
        System.out.println(now);


        boolean leapYear = LocalDate.of(2024, 6, 10).isLeapYear();
        System.out.println("leapYear : " + leapYear);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        Period period = Period.between(LocalDate.of(2008, 1, 2), LocalDate.now());
        System.out.println("Period : " + period.getYears() + " - " + period.getMonths() + " - " + period.getDays());


          Duration duration = Duration.between(LocalTime.of(8, 1, 1), LocalTime.now());
          System.out.println("Duration : " + duration.toHours() + " hours");

    }

}
