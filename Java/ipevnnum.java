import java.util.Scanner;

public class ipevnnum {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);

        System.out.print("Enter the range value:");
        int a = obj.nextInt();
        for(int i=2;i<=a;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
        obj.close();
    }
}
