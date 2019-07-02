package com.test.Training;

interface Example11{
    public void display1();
}
//second interface
interface Example12 {
	public void test();
}



interface vino extends Example12{
	
}


class sample implements vino{

	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}

//This interface is extending both the above interfaces
interface Example13 extends Example11,Example12{
}

class Example14 implements Example13{
    public void display1(){
        System.out.println("display2 method");
    }
    public void display2(){
        System.out.println("display3 method");
    }
    public void test() {
		System.out.println();
	}
		
    
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example14 obj = new Example14();
		obj.display1();
		
	}

}
