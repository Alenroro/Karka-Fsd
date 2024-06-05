import java.util.Scanner;

public class agecalc {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age = a.nextInt();
        int calAge=100-age;
        System.out.println("It will take "+calAge+" to turn 100");
        a.close();
    }
}
