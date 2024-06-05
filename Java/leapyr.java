import java.time.LocalDate;

public class leapyr {
    public static void main(String[] args) {
        LocalDate a= LocalDate.of(2024,11,23);
        if (a.isLeapYear()) {
            System.out.println("leap Year");
        }
        else{
            System.out.println("Not a Leap year");   
        }

    }
}