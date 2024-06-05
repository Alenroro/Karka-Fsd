import java.util.Scanner;

public class gretofthreenum {
     public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);

        System.out.println("Enter the first-no:");
        int a=ip.nextInt();

        System.out.println("Enter the second-no:");
        int b=ip.nextInt();

        System.out.println("Enter the third-no:");
        int c=ip.nextInt();

        if (a>b && a>c) {
            System.out.println("The Greatest number is : "+a);            
        }
        else if(b>c){
            System.out.println("The Greatest number is : "+b);            
        }
        else{
            System.out.println("The Greatest number is :"+c);
        }
        ip.close();
    }
}



