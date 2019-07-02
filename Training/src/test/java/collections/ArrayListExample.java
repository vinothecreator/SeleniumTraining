package collections;

import java.util.*;
public class ArrayListExample {
	
	

	public static void main(String[] args) {
		
		  ArrayList<String> obj=new ArrayList<String>(); 
		  
		  obj.add("Vino");
		  obj.add("Raj");
		  obj.add("Lokie");
		  
		  obj.add(0, "Sri");
		  
		  obj.remove("Raj");
		  
		  System.out.println("Before Sorting:");
		
		
		  
		  for(String str:obj) {
			  System.out.println(str);
		  }
		  
		  Collections.sort(obj);
		  
		  
		  System.out.println("While Loop");
		  int count=0;
		  while(obj.size()>count)
		  {
			 System.out.println(obj.get(count));
			 count++;
		  }
		  
		  
		  System.out.println("Iterator");
		  
		  Iterator<String> it = obj.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  
		  
		
	}

}
