package sample_test;

public class GooglePayCC extends Payment{

	GooglePayCC(String required) {
		super(required);
		// TODO Auto-generated constructor stub
	}
	
	public void paymentMethod() { // method
		System.out.println("CC Payment Method uses: " + this.required);
	}

}
