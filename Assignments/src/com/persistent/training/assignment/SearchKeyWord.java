package com.persistent.training.assignment;

import java.util.Scanner;

class SearchKeyWord {

	static boolean checkKey(String sentence[][],String key) {
		
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i][1].equals(key)) {
				return true;
				
			}
			System.out.print("check :"+i);
		}
		return false;
		
	}
	static String[][] initProductNames() {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Give Numbers of product names you want to add:");
		int n =s.nextInt();
		String array[][]=new String[n][2];
		s.nextLine();
		for (int i = 0; i <n; i++) {
			System.out.print("ProductName :");
			for (int j = 0; j < 2; j++) {
				
				if (j==1) {
					System.out.print("ProductKey :");
				}
				array[i][j]=s.nextLine();
				
				
			}
		}
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
			
		}
		return array;
		
	}
	
	public static void main(String args[]) {
		
		
		/*System.out.print(" Number of products u want to add: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String productName[]= new String[n];
		char keyArry[] = new char[n];
		for (int i = 0; i < n; i++) {
			 System.out.println("Give Product Names: ");
			 productName[i] = sc.nextLine();
			
		}
		
		for (int i = 0; i < n; i++) {
			 System.out.print("Give Product key: ");
			 keyArry[i] = sc.next().charAt(0);
		}
		//print 
		for (int i = 0; i < n; i++) {
			 System.out.println("Product Name: "+productName[i] +"  KeyWord: "+ keyArry[i]);
		}
		//sc.nextLine();
		//System.out.print("Give Sentence: ");
		//String sentence = sc.nextLine();
		System.out.print("Give Key Word(numbers): ");
		int word = sc.nextInt();
		//System.out.print("Occurance of word count is: "+CheckWord.check(sentence,word));*/
		String [][] str;
	    str =SearchKeyWord.initProductNames();
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Give Product key: ");
		String key = sc.nextLine();
		  System.out.print("if keyword present it 'true' else 'false :::>' "+  SearchKeyWord. checkKey(str,key));
	  
		
	}
}
