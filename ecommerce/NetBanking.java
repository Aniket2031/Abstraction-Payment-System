package com.abstaction.example.ecommerce;

public class NetBanking extends Payment{
	
	@Override
	void pay(double amount) {
		System.out.println("pay amount of "+ amount + " Ru "+ "using Net Banking");

	}

}
