package sample_test;

public class ChildCar extends Car {

	ChildCar(String color) { // child class Parameterized constructor
		super(color);
		// TODO Auto-generated constructor stub
	}


	/*
	public void printColor() {
		System.out.println("child object color is: " + this.color);
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Blue");
		car1.printColor();
		
		ChildCar child1 = new ChildCar("Red");
		child1.printColor();
		
		// overriding will takes placs based on the instance we use
		
		int a = 10;
		a = 20;
		

	}

}
