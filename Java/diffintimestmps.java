import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class diffintimestmps {
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.of(1999, 11, 05,10,35,04);
        System.out.println("First Date: " + a);

        LocalDateTime b = LocalDateTime.of(2001, 05, 29,22,45,50);
        System.out.println("Second Date: " + b);

        long diff = ChronoUnit.DAYS.between(a, b);
        long diff1 = ChronoUnit.HOURS.between(a, b);
        long diff2 = ChronoUnit.MINUTES.between(a, b);
        long diff3 = ChronoUnit.SECONDS.between(a, b);

        System.out.println("The difference in Days: " + diff + " days");
        System.out.println("The difference in Hours: " + diff1 + " hrs");
        System.out.println("The difference in Minutes: " + diff2 + " min");
        System.out.println("The difference in Seconds: " + diff3 + " sec");
    }
}
