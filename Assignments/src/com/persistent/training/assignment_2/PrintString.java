package com.persistent.training.assignment_2;

import java.util.Scanner;

public class PrintString {
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Give String: ");
		//int n = sc.nextInt();
		String sent = sc.nextLine();
		char array[]=new char[sent.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sent.charAt(i);
		}
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(array[j]+" ");
			}
			System.out.println();
			//i=0;
		}
	}

}
