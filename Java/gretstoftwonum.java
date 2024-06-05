import java.util.Scanner;

public class gretstoftwonum {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        System.out.println("Enter the first-no:");
        int a=ip.nextInt();

        System.out.println("Enter the second-no:");
        int b=ip.nextInt();

        if (a>b) {
            System.out.println("The Greatest number is : "+a);            
        }else{
            System.out.println("The Greatest number is : "+b);            
        }
        ip.close();

    }
}
