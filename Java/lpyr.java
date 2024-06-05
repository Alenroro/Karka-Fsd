import java.util.Scanner;

public class lpyr {
    static void leapyear(){
         Scanner ip=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=ip.nextInt();
        if (a%4==0 && a%100!=0 || a%400==0) {
            System.out.println(a+" is a leap Year");
            
        }else{
            System.out.println(a+" Is not a leap Year");
        }
        ip.close();
    }
    public static void main(String[] args) {
        leapyear();
    }
}
