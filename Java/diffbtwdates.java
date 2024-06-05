import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class diffbtwdates {
    public static void main(String[] args) {
        LocalDate a= LocalDate.of(1999,11,05);
        System.out.println("First Date: " + a);

        LocalDate b= LocalDate.of(2001,05,29);
        System.out.println("Second Date: " + b);

        long diff= ChronoUnit.DAYS.between(a, b);
        System.out.println("The difference are :"+diff);

        DayOfWeek day1=a.getDayOfWeek();
        DayOfWeek day2=b.getDayOfWeek();
	    System.out.println(day1);
	    System.out.println(day2);

    }
}
