package collections;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> haset = new HashSet<String>();
		haset.add("Lotto");
		haset.add("Minute Mania");
		haset.add("Matching Games");
		
		
		System.out.println("Hashset elements contains:" + haset);
		
		String[] array = new String[haset.size()];
		haset.toArray(array);
		
		System.out.println("#################");
		System.out.println("Array Contains");
		System.out.println("#################");
		for(String str:array)
		{
			System.out.println(str);
		}
		
		
		

	}

}
