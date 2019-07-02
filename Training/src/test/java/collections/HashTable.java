package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		 Hashtable ht = new Hashtable();
	      ht.put("1", "One");
	      ht.put("2", "Two");
	      ht.put("3", "Three");
	      Enumeration e = ht.elements();	
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
		*/
		
	//	File srcfile =((TakeScreenshot)driver).getScreenshotAs(outputType.FILE);
		 List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		 
		 List<String> list2 = Arrays.asList("la la zslalalalalala".replaceAll("la", "vino"));
		 
		  List<Integer> list3 = Arrays.asList(5,4,3,7,2,1);
		 Collections.sort(list3);
		 //System.out.println(list2);
		 list3.forEach(System.out:: println);
		 
		 
		 //JavascriptExecutor js = (JavascriptExecutor) driver; 
	
		 
		 
		 
		
		 
	      System.out.println(list);
	      System.out.println("max: " + Collections.max(list));
	      System.out.println("min: " + Collections.min(list));
	      Collections.replaceAll(list, "one", "newvalue");
	      System.out.println("ReplaceList: " +  list);
		
	      List<Integer> numbers = new ArrayList<Integer>();
	      for(int i=0;i<=10;i++) numbers.add(i);
	      System.out.println("List before reverse: "+ numbers);
	      Collections.reverse(numbers);
	      System.out.println("List after reverse: "+ numbers);
	      
		
		
	      
	      
		
		
	}

}
