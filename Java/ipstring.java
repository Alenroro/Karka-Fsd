import java.util.Scanner;

public class ipstring {
    
    public static void main(String[] args) {
      
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the name:");
        String result = a.nextLine();
        System.out.println("The Name is "+result+" The System Welcomes you!");
        a.close();
        
    }
}
