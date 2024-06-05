import java.util.ArrayList;
import java.util.List;

public class divbyfive {
    public static void main(String[] args) {
         List<Integer> myList = new ArrayList<Integer>();
 
        myList.add(45);
        myList.add(78);
        myList.add(95);
        myList.add(5);
        myList.add(10);
        myList.add(37);
        myList.add(89);
        myList.add(14);
        myList.add(36);
 
        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) % 5==0) {
            System.out.println(myList.get(i));
                                
            }else{           
                 System.out.println("It is not divisible by 5");
            }
        }
    }
}