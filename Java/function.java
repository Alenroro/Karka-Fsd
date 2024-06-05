import java.util.Scanner;

public class function{
    static void Out()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=sc.nextInt();
        int result=a*a;
        System.out.println("The output is " +result);
        sc.close();
    }
    public static void main(String[] args) {
        function.Out();
    }
}