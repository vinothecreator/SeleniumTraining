package ActiTime;

import java.util.Scanner;

public class StringRev {

	   public static void main(String args[]) {
		 //code
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			sc.nextLine();
			while(t>0){
			    String s=sc.nextLine();
			   // System.out.println(s);
			    String a[]=s.trim().split("\\.");
			    for(int i=a.length-1;i>=0;i--)
			    {
			        System.out.print(a[i]);
			        if(i!=0)
			        System.out.print(".");
			    }
			    System.out.println();
			    t--;
			}
		}
	}