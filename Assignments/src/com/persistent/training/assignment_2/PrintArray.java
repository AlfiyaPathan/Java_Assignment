package com.persistent.training.assignment_2;

import java.util.Scanner;

public class PrintArray {

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Give size of Array: ");
		int n = sc.nextInt();
		char array[][]=new char[n][n];
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0;j<i+1&&j<n/2;j++) {
				
				System.out.print(j+1);
				
			}
			System.out.println();
		}
		//System.out.print("a");
		for (int i = n/2; i >=1 ; i--) {
			for (int j = 1;j<i;j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
	}
}
