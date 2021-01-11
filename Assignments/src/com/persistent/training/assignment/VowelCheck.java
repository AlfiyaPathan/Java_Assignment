package com.persistent.training.assignment;

import java.util.Scanner;

public class VowelCheck {
	
	static boolean checkAlpha(char alph) {
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
		return true;
		else
			return false;
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Character To Check Vowel Or Not:");
		char alphabet = sc.next().charAt(0);
		boolean Status =VowelCheck.checkAlpha(alphabet);
		if(Status==true)
			System.out.println("It is vowel");
		else
			System.out.println("It is not vowel");
		
		
		
		
	}
}
