public class nullexception {
    public static void main(String[] args) {
        try {
          String a = "null";
          int length = a.length();
          System.out.println("Length of the string: " + length);
        }catch (NullPointerException e) {
          System.err.println("Caught NullPointerException: " + e.getMessage());
        }finally{
            System.out.println("Thank you");
        }
    }
}
