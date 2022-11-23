package com.basu.samples;

public class PassByTest {

	int a ;// variable a is available to all the objects created from the class
	
	PassByTest(int a){
		this.a = a;
	}
	
	public void call(int a) { // variable a is local to the method call
		a = a + 1;
	}
	
	public void call(PassByTest obj) { // variable a is local to the method call
		obj.a = obj.a + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassByTest obj1 = new PassByTest(10);
		PassByTest obj2 = new PassByTest(20);
		
		System.out.println("a value: "+ obj1.a);
		
		obj1.call(10);
		obj2.call(obj2);

	}

}
