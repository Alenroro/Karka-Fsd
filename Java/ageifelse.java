import java.util.Scanner;

public class ageifelse {
    public static void main(String[] args) {

         Scanner obj =new Scanner(System.in);

        System.out.print("Enter your age:");
        int a = obj.nextInt();
        if (a >= 18) {
            System.out.println("You are elligible to vote.");
        }else{
            System.out.println("You are not elligible to vote.");
            
        }

        obj.close();
    }
}
