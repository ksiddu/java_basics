package sample_test;

public class PassByReference {

	int a = 10;
	int b = 20;
	//String name = "Siddu";
	
	void call(PassByReference obj) { // obj = obj1, both points to same address // local to the method
		obj.a = obj.a + 1;
		obj.b = obj.b + 2;
	}
	
	public static void main(String[] args) { // starting point of the class
		// TODO Auto-generated method stub

		PassByReference obj1 = new PassByReference(); // global to main method
		
		//PassByReference obj2 = new PassByReference();
		
		System.out.println("Before call-by-reference: " + obj1.a); // 10
		System.out.println("Before call-by-reference: " + obj1.b); // 20
		
		obj1.a = 30;
	
		// call method obj gets created
		obj1.call(obj1); // obj = obj1
		// call method obj gets destroyed
		
		
		obj1.a = 40;
		
		// call method obj gets created
		obj1.call(obj1);
		// call method obj gets destroyed
		
		obj1.a = 50;
		
		obj1.call(obj1);
		
		
		System.out.println("After call-by-reference: " + obj1.a); // 11
		System.out.println("After call-by-reference: " + obj1.b); // 22
		

				
	}

}
