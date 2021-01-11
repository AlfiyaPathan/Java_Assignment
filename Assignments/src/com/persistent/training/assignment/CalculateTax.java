package com.persistent.training.assignment;

import java.util.Scanner;

class CalculateTax {
	static double taxAmount;
	static double calTax(int gp) {
		
		if(gp<=240)
		{
			taxAmount=gp;
			
			
		}
		else
			{
			if(gp<=480&&gp>240) {
			taxAmount=gp*0.15;
			
			}else {
				if(gp>480) {
					taxAmount=gp*0.28;
				}}
			}
		return taxAmount;
		
	}
	
	public static void main(String args[]) {
		
		
		System.out.println("Gross Pay:");
		Scanner sc = new Scanner(System.in);
		int gpy = sc.nextInt(); 
		System.out.println("Tax Owned is:"+ CalculateTax.calTax(gpy));

	}
}
