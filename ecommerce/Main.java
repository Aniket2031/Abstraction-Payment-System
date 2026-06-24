package com.abstaction.example.ecommerce;

public class Main {
 
	 public static void main(String[] args) {
		
		 Payment p = new UPI();
		 p.pay(50000);
		 
		 Payment p2 = new CreaditCard();
		 p2.pay(24000);
		 
		 Payment p3 = new NetBanking();
		 p3.pay(30000);
	}
	 
}
