import java.util.Scanner;

public class voworcons {
    public static void main(String[] args) {
     
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the character:");
        char a=ip.next().charAt(0);
        char b = Character.toLowerCase(a);

        if(Character.isLetter(a)){
            if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
                System.out.println("Vowel");
            }else{
            System.out.println("Consonant");
            }
        }else{
            System.out.println("Enter Valid Character");
        }
        ip.close();
    }
    
}
