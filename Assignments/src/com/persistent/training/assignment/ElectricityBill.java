package com.persistent.training.assignment;

import java.util.Scanner;

class ElectricityBill {
	
	static void commercialBill(int units)
	{
		double amount;
		if(units<=100) {
			amount = units*4.25;
			if (amount<350)
				amount=350;
			System.out.print("Electricity Bill Is: "+amount);	
			
		}
		if(units>100&&units<300) {
			amount=units*4.75;
			System.out.print("Electricity Bill Is: "+amount);
			}
		if(units>300&&units<500) {
			amount=units*5;
			System.out.print("Electricity Bill Is: "+amount);
			}
		if(units>500) {
			amount=units*5.25;
			System.out.print("Electricity Bill Is: "+amount);
		}
		
		
			
	}
	
	static void domesticBill(int units)
	{
		double amount;
		if(units<=100) {
			amount = units*4;
			if (amount<250)
				amount=250;
			System.out.print("Electricity Bill Is: "+amount);	
			
		}
		if(units>100&&units<300) {
			amount=units*4.5;
			System.out.print("Electricity Bill Is: "+amount);
			}
		if(units>300&&units<500) {
			amount=units*4.75;
			System.out.print("Electricity Bill Is: "+amount);
			}
		if(units>500) {
			amount=units*5;
			System.out.print("Electricity Bill Is: "+amount);
		}
		
		
			
	}
	
	public static void main(String arg[]) {
	
	System.out.print("Is Connection is domestic or commericial(type 'c' for commercial and 'd' for domestic): ");
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	System.out.print("Units Used Are:" );
	int units = sc.nextInt();
	if(c=='c'||c=='C')
	{
		ElectricityBill.commercialBill(units);
	}
	else if(c=='d'||c=='D')
	{
		ElectricityBill.domesticBill(units);
	}
	
	//System.out.print(" Profit is: "+ShowProfit.calculateProfit(number));
	}
}
