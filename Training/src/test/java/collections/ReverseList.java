package collections;

import java.util.ArrayList;
import java.util.Comparator;

import edu.emory.mathcs.backport.java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Amazon");
		arr.add("Flipkart");
		arr.add("walmart");
		arr.add("Ali Express");
		
		Comparator comp = Collections.reverseOrder();

		Collections.sort(arr,comp);
		
/*	System.out.println("Before Reverse:" + arr);
	Collections.reverse(arr);
System.out.println("After Reverse");
System.out.println(arr);*/
	
	
	}

}
