package com.persistent.training.assignment;

import java.util.Scanner;

class Game {
	
	static char check(char arr[][])
	{
		if (arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]) {
			return arr[0][0];
				
		}
		if (arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]) {
			return(arr[0][2]);
		}
		if (arr[0][0]==arr[0][2]&&arr[0][1]==arr[0][2]) {
			return(arr[0][0]);
		}
		if (arr[1][0]==arr[1][2]&&arr[1][1]==arr[1][2]) {
			return(arr[1][0]);
		}
		if (arr[2][0]==arr[2][2]&&arr[2][1]==arr[2][2]) {
			return(arr[2][0]);
		}
		if (arr[0][0]==arr[1][0]&&arr[1][0]==arr[2][0]) {
			return(arr[0][0]);
		}
		if (arr[0][1]==arr[1][1]&&arr[1][1]==arr[2][1]) {
			return(arr[0][1]);
		}
		if (arr[0][2]==arr[1][2]&&arr[1][2]==arr[2][2]) {
			return(arr[0][2]);
		}
		else
			return 0;
	}
	
	
	public static void main(String[] args) {
	//int x,o;
	char arr[][]=new char[4][4];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Input of x & o :");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			
			arr[i][j]=sc.next().charAt(0);
			
		}
		
	}
	
	// for print
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			
			System.out.print(arr[i][j]+" ");
			
		}
		System.out.println();
		
	}
	
	// for checking 
	/*for(int i=0,j=0;j<4&&i<4;j++,i++) {
		
			if (i==j&&arr[i][j]==arr[i+1][i+1]&&arr[i][j]==arr[i+2][i+2]) {
				System.out.print(arr[i][j]);
				break;
			}
			if (arr[i][j]==arr[i][j+1]&&arr[i][j]==arr[i][j+2]) {
				System.out.print(arr[i][j]);
				break;
			}
			if (arr[i][j]==arr[i+1][j]&&arr[i][j]==arr[i+2][j]) {
				System.out.print(arr[i][j]);
				break;
			}
			if (arr[i+2][j]==arr[i][j+2]&&arr[i+1][j+1]==arr[i+2][j]) {
				System.out.print(arr[i][j]);
				break;
			
		
		
		 }
		 System.out.print("Game Over");
			break;

	}
	*/
	if(Game.check(arr)==0)
	{
	System.out.println("Both Player Failed");
	}
	else
		System.out.println("Player Of "+Game.check(arr) +" won");
		

}
}
