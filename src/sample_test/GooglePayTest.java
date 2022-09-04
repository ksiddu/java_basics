package sample_test;

public class GooglePayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// run time polymorphism --> function overriding - inheritance concept
		GooglePayUpi upi = new GooglePayUpi("PIN");
		GooglePayCC cc = new GooglePayCC("Number & OTP");
		GooglePayIB ib = new GooglePayIB("Username & Password");
		
		upi.paymentMethod();
		cc.paymentMethod();
		ib.paymentMethod();

	}

}
