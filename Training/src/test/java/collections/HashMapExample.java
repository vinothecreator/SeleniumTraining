package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(12, "Tom");
		hmap.put(13, "Jerry");
		hmap.put(14, "test");
		
		System.out.println("Iterator Method");
		//Display the results
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
		       Map.Entry mentry = (Map.Entry)it .next();
		       System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());
		}
		
		   String var= hmap.get(2);
		      System.out.println("Value at index 2 is: "+var);
		
		      System.out.println("LOOP Method");
		      
		      for(Map.Entry Me : hmap.entrySet()) {
		    	  System.out.println("Key:" + Me.getKey() + "&Value :" + Me.getValue());
		      }
		      
		      
		      System.out.println("WHILE LOOP Method");
		      Iterator itw = hmap.entrySet().iterator();
		      while (itw.hasNext()) {
		    	  Map.Entry me3= (Map.Entry) itw.next();
		    	  System.out.println("Key:" + me3.getKey() + "&Value :" + me3.getValue());
		      }
		

	}

}
