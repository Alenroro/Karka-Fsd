import java.util.Scanner;

public class chkevnodd {
    static void chck(){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=num.nextInt();

        if (a%2==0) {
            System.out.println("Its Even Number");
        }else{
            System.out.println("Its Odd Number");
        }
        num.close();
    }

    public static void main(String[] args) {
        chkevnodd.chck();
    }
}
