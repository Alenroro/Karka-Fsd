import java.util.ArrayList;
import java.util.List;

public class filternegpos {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> posList = new ArrayList<Integer>();
        List<Integer> negList = new ArrayList<Integer>();
 
        myList.add(45);
        myList.add(-78);
        myList.add(95);
        myList.add(5);
        myList.add(-10);
        myList.add(-32);
        myList.add(78);
        myList.add(-31);
        myList.add(89);
        myList.add(90);
        myList.add(-15);
        myList.add(65);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i)>0) {
                posList.add(myList.get(i));                  
            }else{         
                negList.add(myList.get(i));              
            } 
        }
        
        System.out.println("The Positive Numbers are : "+posList);
        System.out.println("The Negative Numbers are : "+negList);
    }   
}