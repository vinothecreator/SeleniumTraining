package com.test.Training;

abstract class test{
	abstract void see();
	public void see1() {
		System.out.println("test Menthod");
	}
	
}

class demo extends test{

	@Override
	void see() {
		// TODO Auto-generated method stub
		
	}

	
}
	
	
	class Example1{
		   public void display1(){
		      System.out.println("display1 method");
		   }
		}
	
	
		abstract class Example2{
		   public void display2(){
		      System.out.println("display2 method");
		   }
		}
		abstract class Example3 extends Example1{
		   abstract void display3();
		}
		class Example4 extends Example3{
		   public void display3(){
		      System.out.println("display3 method");
		   }
		}


public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Example4 obj=new Example4();
	       obj.display1();
	}

}
