package sample_test;

public class Child extends Parent {
	
	Child(int a){
		super(a); // 1. to call the parent constructor
		
		
	}
	
	void printParentValues() {
		System.out.println("Access value of parent x : "+ super.x);// 2. to access the parent variables and methods
	}

	
	
	public static void main(String[] args) {
		
		Parent parent = new Parent(10);
		parent.printValue();
		
		Child child = new Child(20);
		child.printValue();
		
		
	}
	

}

