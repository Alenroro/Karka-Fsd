import java.time.LocalDate;

public class rangeofdate {
    public static void main(String[] args) {
        LocalDate a= LocalDate.of(1499,11,23);
        System.out.println("Date: " + a);

        LocalDate b= LocalDate.of(2001,05,29);
        System.out.println("Second Date: " + b);

        if (a.isAfter(b)) {
            System.out.println("within Range"); 
        }else{
            System.out.println("Not in Range"); 

        }
    }
}
