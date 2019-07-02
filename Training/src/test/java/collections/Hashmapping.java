package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapping {

	public static void main(String[] args) {


	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    System.out.println("Is HashMap Empty? "+hashmap.isEmpty());
	    
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    hashmap.put(33,"Value3");
	    hashmap.put(44,"Value4");
	    hashmap.put(55,"Value5");
	    hashmap.put(66,"Value6");
	    
	    
	  
	    System.out.println("Cloned Map contains: "+hashmap); 
	 
	    
	    Set set= hashmap.entrySet();
	    Iterator it = set.iterator();
	    
	    while(it.hasNext())
	    {
	    	Map.Entry en =(Map.Entry)it.next();
	    	System.out.println("Key is:"+ en.getKey()+ " & value is  "+ en.getValue());
	    }
	    
	    
	    
	   
	    
/*	  Object remo = hashmap.remove(55);

	  HashMap<Integer, String> hmap2 = new HashMap<Integer, String>(); 
	  
	  hmap2=(HashMap) hashmap.clone();
	  
	  System.out.println("Cloned Map contains: "+hmap2); */
	  
	/*    System.out.println("Element removed is: " +remo);
	    
	    System.out.println("HashMap Elements: " + hashmap);
	    
	    System.out.println("Is HashMap Empty? "+hashmap.isEmpty());*/
	}

}
 