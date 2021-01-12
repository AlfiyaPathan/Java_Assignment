package com.persistent.training.assignment_2;

import java.util.Scanner;

public class CountSpaces {

	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Give Sentence: ");
		String sentence = sc.nextLine();
		//char string []=new char[sentence.length()]; 
		int count=0;
		for(int i=0;i<sentence.length();i++) {
			if (sentence.charAt(i)==' ') {
				count++;
			}
			
				
			
		}
		System.out.print("count: "+count);
	}
}
