import java.util.ArrayList;
import java.util.*;

public class noduplicate {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<Integer>();
	    originalList.add(1);
	    originalList.add(2);
	    originalList.add(2);
	    originalList.add(3);
	    originalList.add(4);
	    originalList.add(4);
	    originalList.add(5);
        
	    System.out.println("Original List: " + originalList);
	    ArrayList<Integer> uniqueList1 = new ArrayList<>(new HashSet<>(originalList));
	    System.out.println("List after removing duplicates : " + uniqueList1);

    }
}
