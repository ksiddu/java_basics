package sample_test;

public class Sample {
	
	int a;
	int b;
	int age = 25; // 18 - 25--> young
	// 26 - 50 --> old
	Sample(){
		a = 10;
		b = 20;
	}
	
	Sample(int x, int y){
		a = x;
		b = y;
		
	}
	
	public void changeValueOfVariableA(int x) {
		a = x;
	}
	
	public static void main(String[] args) {
		System.out.println("==== obj1 data=====");
		Sample obj1 = new Sample();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		System.out.println("==== obj2 data=====");
		Sample obj2 = new Sample();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		System.out.println("==== obj3 data=====");
		Sample obj3 = new Sample(1, 2);
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		
		System.out.println("==== obj4 data=====");
		Sample obj4 = new Sample(3, 4);
		System.out.println(obj4.a);
		System.out.println(obj4.b);
		
		System.out.println("==== obj5 data=====");
		Sample obj5 = new Sample(100, 200);
		System.out.println(obj5.a);
		System.out.println(obj5.b);
		obj5.changeValueOfVariableA(300);
		System.out.println(obj5.a);
		System.out.println(obj5.b);
		
	}

}
