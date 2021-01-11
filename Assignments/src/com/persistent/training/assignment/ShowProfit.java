package com.persistent.training.assignment;

import java.util.Scanner;

class ShowProfit {

	static float calculateProfit(int num) {
		
		float profit;
		double price = 0.5*num;
		//System.out.print(price);
		float f =(float)price;
		//System.out.print(f);
		profit = 5*num-20-f ;
		return profit;
	}
	
	
public static void main(String args[]) {
		
		System.out.print("Number Of Attendee Are: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		//PrimeNumbers obj = new PrimeNumbers();
		//obj.isPrimeNumber(number);
		System.out.print(" Profit is: "+ShowProfit.calculateProfit(number));
		
		
	
}
}
