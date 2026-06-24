
package com.abstaction.example.ecommerce;

public class UPI extends Payment {
    
	double amount;
	
	@Override
	void pay(double amount) {
		
		this.amount = amount;
		
		System.out.println("pay amount of "+ amount + " Ru "+"using UPI");
		
	}
}
