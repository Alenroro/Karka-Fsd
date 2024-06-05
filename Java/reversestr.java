public class reversestr {
    public static void main(String[] args) {
        String str="123";
        String revStr="";
        System.out.println("String: "+str);
        for(int i=0;i<str.length();i++){
            revStr=str.charAt(i)+revStr;
        }
        System.out.println("Reversed string: "+revStr);
    }
}
