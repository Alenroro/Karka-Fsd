import java.util.Scanner;

public class prodndsum {
    public static void main(String[] args) {
         Scanner ip=new Scanner(System.in);

        System.out.println("Enter the first-num:");
        double a=ip.nextInt();

        System.out.println("Enter the second-num:");
        double b=ip.nextInt();

        double sum=a+b;
        double product=a*b;
        System.out.println("The Product is : "+product);

        if (product>500) {
            System.out.println("The sum is : "+sum);
        }
        ip.close();
    }
}
