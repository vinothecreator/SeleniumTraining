package collections;

import java.util.Set;
import java.util.Map;
import java.util.Iterator;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map treemap= (Map) new TreeMap();
	    treemap.put("Key1", "Pear");
	    treemap.put("Key2", "Apple");
	    treemap.put("Key3", "Orange");
	    treemap.put("Key4", "Papaya");
	    treemap.put("Key5", "Banana");
		
	    
	    Set set = treemap.entrySet();
	    Iterator it = set.iterator();
		

	    while(it.hasNext())
	    {
	    	Map.Entry pair=(Map.Entry)it.next();
	    	System.out.print("Key is: "+pair.getKey() + " and ");
	        System.out.println("Value is: "+pair.getValue());
	    	
	    	
	    }
	    
	}

}
