package com.basu.samples;

public class Payment {
	
	String required; // varaible
	
	Payment(String required){
		this.required = required;
	}
	
	public void paymentMethod() { // method
		System.out.println("Payment Method uses: " + this.required);
	}

}

// GooglePay Example : 
// 1. UPI Link Bank Account -- PIN
// 2. Credit Card -- Number & OTP
// 3. Internet Banking -- Username & Password
