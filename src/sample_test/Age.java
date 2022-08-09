package sample_test;

public class Age {
	
	int age; 
	// 18 - 25--> young
	// > 25 old
  
	// default constructor
	Age(){
		age = 25;
	}
	
	// parameterized constructor
	Age(int x){
		age = x;
	}
	
	public void printAgeStatus() {
		if(age>=18 && age<=25) {
			System.out.println("Young");
		}
		else {
			System.out.println("Old");
		}
	}
	
	// if age is >=40, increase age by 5 years
	public void increaseAge() {
		if(age>=40) {
			age = age +5;
			System.out.println("Age is increased age by 5");
		}
		else {
			System.out.println("Age is not increased");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age obj1 = new Age();// default constructor
		
		Age obj2 = new Age(30); // parameterized constructor
		
		Age obj3 = new Age(19); // parameterized constructor
		
		Age obj4 = new Age(60); // parameterized constructor
		
		
		System.out.println("==== obj1 data=====");
		//System.out.println(obj1.age);
		obj1.printAgeStatus(); // object.methodName
		
	
		System.out.println("==== obj2 data=====");
		//System.out.println(obj2.age);;
		obj2.printAgeStatus(); // object.methodName
		
		
		
		/*
		System.out.println(obj3.age);;
		if(obj3.age>=18 && obj3.age<=25) {
			System.out.println("Young");
		}
		else {
			System.out.println("Old");
		}
		
		System.out.println(obj4.age);;
		if(obj4.age>=18 && obj4.age<=25) {
			System.out.println("Young");
		}
		else {
			System.out.println("Old");
		}
		*/
		obj3.printAgeStatus();
		obj4.printAgeStatus();
		
		Age obj5 = new Age(20); // parameterized constructor
		Age obj6 = new Age(80); // parameterized constructor
		
		
		System.out.println("Before method call");
		System.out.println(obj5.age);
		System.out.println(obj6.age);
				
		System.out.println("After method call");
		obj5.increaseAge();
		obj6.increaseAge();
		System.out.println(obj5.age);
		System.out.println(obj6.age);
	}

}
