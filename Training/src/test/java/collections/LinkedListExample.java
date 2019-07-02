package collections;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> linkedlist = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");
  
	    
	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);
		
	    
	       System.out.println(linkedlist.size());
	       
	       System.out.println("loop");
	       //For Loop
	       
	       for(int n=0;n<linkedlist.size();n++)
	       {
	    	   System.out.println(linkedlist.get(n));
	       }
	       
	       
	       linkedlist.add("Vino Element");
	       linkedlist.add(6, "Test Element");
	       linkedlist.addFirst("First Element");
	       
	       System.out.println("For Each loop");
	       //For Each Loop
	       
	       for(String str:linkedlist)
	       {
	    	   System.out.println(str);
	       }
	       
	       
	       System.out.println("iterator");
	       
	       //using Iterator
	      
	   
	       Iterator<String> it = linkedlist.iterator();
	       while(it.hasNext())
	       {
	    	   System.out.println(it.next());
	       }
	
	
	       System.out.println("**While Loop**");
	
	int num=0;
	while(linkedlist.size()> num)
	{
		System.out.println(linkedlist.get(num));
		num++;
	}
	
	
	

}}
