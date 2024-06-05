public class occofevenodd {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int c=10;c<=55;c++){
            if (c%2==0) {
                a++;
            }else{
                b++;
            }
        }
        System.out.println("The count of Even numbers are: "+a);
        System.out.println("The count of Odd numbers are: "+b);
    }
}