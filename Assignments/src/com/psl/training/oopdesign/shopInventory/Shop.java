package com.psl.training.oopdesign.shopInventory;
import java.util.*;
public class Shop {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Product pa[]= new Product [6];
		
	
		
		
		for (int i = 0; i <pa.length; i++) {
			System.out.println("**********SHOP ABC*********");
			System.out.println("1.Microsoft");
			System.out.println("2.Tally");
			System.out.println("3.Computer");
			System.out.println("4.Laptop");
			System.out.println("5.Car Deck");
			System.out.println("6.Home Theater System");
			System.out.println("Please Enter number of what you want buy: ");
			int n = sc.nextInt();
			switch(n){
			
			case 1:
				pa[i]=new MicrosoftOffice(1,"Microsoft","Micro098");
				MicrosoftOffice m =  (MicrosoftOffice)pa[i];
				m.hasOS("Linux/Windows 10");
				m.sizeOfMemory("4 gb");
				m.hasLicenseKey();
				m.hasPrice(1200);
				System.out.println();
				break;
			case 2:
				pa[i]=new Tally(2,"Tally","Tally_2");
				Tally t = (Tally)pa[i];
				t.hasOS("Linux/Windows 10");
				t.sizeOfMemory("4 gb");
				t.hasLicenseKey();
				t.hasPrice(1000);
				System.out.println();
				break;
			case 3:
				
				pa[i]=new Computer(1,"Computer_123","comp1234");
				Computer p = (Computer) pa[i];
				p.hasOS("Linux");
				p.sizeOfMemory("4 GB");
				p.brandOfProduct("Dell");
				p.BatteryBackUp();
				p.hasBattery();
				p.hasPrice(45000);
				System.out.println();
				break;
			case 4:
				Laptop l=new Laptop(101,"Laptop_123","laptop1234");
				l.hasOS("Windows 10");
				l.sizeOfMemory("4 GB");
				l.brandOfProduct("hp");
				l.BatteryBackUp();
				l.hasBattery();
				l.hasPrice(50000);
				System.out.println();
				break;
			case 5:
				pa[i]=new CarDeck(123,"CarDeck Vista","0987yu");
				CarDeck c = (CarDeck)pa[i];
				c.brandOfProduct("Vista");
				c.hasBattery();
				c.BatteryBackUp();
				c.hasPrice(5000);
				System.out.println();
				break;
			case 6:
				pa[i] = new HomeTheater(102,"HomeTheater","0945rft");
				HomeTheater h = (HomeTheater)pa[i];
				h.brandOfProduct("Samsung");
				h.BatteryBackUp();
				h.hasBattery();
				h.hasPrice(10000);
				System.out.println();
				break;
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
		}

	}

}
