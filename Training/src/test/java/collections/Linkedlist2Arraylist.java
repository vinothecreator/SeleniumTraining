package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist2Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> link = new LinkedList <String>();
		
		link.add("test");
		link.add("pch");
		link.add("acc");
		
		ArrayList<String> list = new ArrayList<String>(link);
  list.remove(1);
		
		for(String li:list)
		{
			System.out.println(li);
		}

	}

}
