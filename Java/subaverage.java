import java.util.Scanner;

public class subaverage {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);

        System.out.print("Enter the Total no of subjects:");
        int noOfSub = a.nextInt();

        System.out.print("Tamil:");
        int tam = a.nextInt();

        System.out.print("English:");
        int eng = a.nextInt();

        System.out.print("Maths:");
        int math = a.nextInt();

        System.out.print("Science:");
        int science = a.nextInt();

        System.out.print("Social:");
        int social = a.nextInt();
        int total=tam+eng+math+science+social;
        double average=total/noOfSub;
        System.out.println("Total:"+total);
        System.out.print("Average:"+average);

        a.close();
        
    }
}
