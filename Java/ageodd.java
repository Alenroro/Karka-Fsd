import java.util.Scanner;

public class ageodd {

     public static void main(String[] args) {

         Scanner obj =new Scanner(System.in);

        System.out.print("Enter your age:");
        int a = obj.nextInt();
        for(int i=1;i<=a;i++){
            if (i%2!=0) {
                System.out.println(i);
            }
        }

        obj.close();
    }
}