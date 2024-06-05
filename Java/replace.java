public class replace {
    public static void main(String[] args) {
    String str = "This is a string of alen.";
    //it takes ip as a character and changes the character throughout the string it also works for string
    str = str.replace("alen", "boat");
    System.out.println(str); 
    
    String str1 = "This is a string of alen.";
    //it takes ip in string and changes the first occurances
    str1 = str1.replaceFirst("a", "b");
    System.out.println(str1);

    String str2 = "This is a string of alen.";
    //it takes ip in string and changes all the oeccurence
    str2 = str2.replaceAll("This", "b");
    System.out.println(str2); 
    }
}
