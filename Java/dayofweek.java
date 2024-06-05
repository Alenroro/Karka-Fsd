import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
	    int dayNumber=sc.nextInt();
	    String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            
	    if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("Weekday "+dayNumber+": " + daysOfWeek[dayNumber - 1]);
        } else {
	        System.out.println("Error");
        }
        sc.close();
    }
}