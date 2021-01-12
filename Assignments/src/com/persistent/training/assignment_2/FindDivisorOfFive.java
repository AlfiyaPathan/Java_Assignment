package com.persistent.training.assignment_2;

import java.util.Scanner;

public class FindDivisorOfFive {


	public static void main(String args[]) {
	
	System.out.print("Give Numbers of number you want:");
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	int array []=new int[n];
	System.out.print("Numbers: ");
	int count=0;
	for (int i = 0; i < array.length; i++) {
		array[i]=sc.nextInt();
	}
	for (int i = 0; i < array.length; i++) {
		if (array[i]%2==0&&array[i]%5==0) {
			count++;
			System.out.print("Numbers: "+array[i]);
		}
	}
	System.out.print("Numbers: "+count);
	
	}
	
	
}
