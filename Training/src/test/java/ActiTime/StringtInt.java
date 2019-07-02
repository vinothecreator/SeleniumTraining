package ActiTime;

import java.util.Scanner;

public class StringtInt {

	
	Scanner scn = new Scanner(System.in); 
	 String num = scn.nextLine();
	static String test = "testing";
	 static char ch = test.charAt(6);

	
	 int num2 = Integer.parseInt(num);
	 int a=scn.nextInt();
	 int b=scn.nextInt();
	
	 void add()
	{
		int result  =num2+b+a;
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(ch);
		
		StringtInt SI  = new StringtInt();
		SI.add();
	

	}

}
