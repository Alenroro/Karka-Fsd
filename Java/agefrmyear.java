import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class agefrmyear {
    public static void main(String[] args) {
        LocalDate a=LocalDate.of(2001, 05, 29);
	LocalDate b=LocalDate.now();
	long age=ChronoUnit.YEARS.between(a, b);
	System.out.println("The age of the person is:"+age);
    }
}
