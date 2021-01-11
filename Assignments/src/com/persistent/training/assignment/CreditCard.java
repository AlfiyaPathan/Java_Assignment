package com.persistent.training.assignment;

import java.util.Scanner;

class CreditCard {
	
	static float PayBack(float amount) {
		double payBack;
		if(amount<=500) {
			payBack =amount*0.0025;
			float f = (float)payBack;
			return f;
			
		}
		if(amount>500&&amount<=1500) {
			payBack=amount*0.0050;
			float f = (float)payBack;
			return f;
			
		}
		if(amount>1500&&amount<=2500) {
			payBack=amount*0.0075;
			float f = (float)payBack;
			return f;
		}
		else
		 {
			payBack=amount*0.01;
			float f = (float)payBack;
			return f;
		}
			
		
		
		
		
	}
public static void main(String args[]) {
		
		System.out.print("Charges: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		System.out.print("PayBack Is: "+CreditCard.PayBack(number));
		
}

}
