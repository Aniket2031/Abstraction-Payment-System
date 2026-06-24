 package com.abstaction.example.ecommerce;

public class CreaditCard extends Payment {

	@Override 
	void pay(double amount) {
		System.out.println("pay amount of "+ amount + " Ru "+ "using Credit Card");
	}
}
