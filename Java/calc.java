import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
         Scanner obj =new Scanner(System.in);

        System.out.print("Enter the First Number:");
        int a = obj.nextInt();

        System.out.print("Enter the Second Number:");
        int b = obj.nextInt();

        System.out.print("Enter the Third Number:");
        int c = obj.nextInt();

        double result=(a+b+c)/2;
        System.out.println("The result is:"+result);
        obj.close();
    }
}

