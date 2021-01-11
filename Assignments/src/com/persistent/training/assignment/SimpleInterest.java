package com.persistent.training.assignment;

import java.util.Scanner;

class SimpleInterest {
	
	static double callInterest(int amt,float inr) {
		
		double amount;
		float in = inr/100;
		//System.out.println(in);
		amount = amt*(1+in);
		//System.out.println(amount);
		return amount;
		
		
	}
	public static void main(String args[]) {
		
		System.out.println("State deposite amount & interest:");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt(); 
		float r =sc.nextFloat();
		System.out.println("Amount Earned In Year is:"+ SimpleInterest.callInterest(amount,r));
		
		
		
	}
}
