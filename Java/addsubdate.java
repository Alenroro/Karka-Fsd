import java.time.LocalDate;

public class addsubdate {
    public static void main(String[] args) {
        LocalDate a= LocalDate.now();
        System.out.println("Current Date: " + a);

        LocalDate b= a.plusDays(5);
        LocalDate c=a.minusDays(7);
        
        System.out.println("Date after adding: " + b);
        System.out.println("Date After subtracting: " + c);

    }
}
