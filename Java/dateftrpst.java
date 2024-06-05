import java.time.LocalDate;

public class dateftrpst {
    public static void main(String[] args) {
        LocalDate a= LocalDate.of(1499,11,23);
        LocalDate b = LocalDate.now();
        if (a.isAfter(b)) {
            System.out.println("Future"); 
        }else{
            System.out.println("Past"); 

        }
    }
}
