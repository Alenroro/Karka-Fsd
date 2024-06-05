import java.util.ArrayList;
import java.util.List;

public class filteroddevn {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();
 
        myList.add(45);
        myList.add(78);
        myList.add(95);
        myList.add(5);
        myList.add(10);
        myList.add(37);

        for (int i = 0; i < myList.size(); i++) {

            if (myList.get(i) % 2==0) {
                evenList.add(myList.get(i));                  
            }else{         
                oddList.add(myList.get(i));  
                 
            } 
        }
         System.out.println("The even Numbers are : "+evenList);
            System.out.println("The even Numbers are : "+oddList);
    }

     
}
