package com.persistent.training.medicine;

public class Ointment extends Medicine{
	
	
	@Override
	public void displayLable(String name,String address) {
			
			System.out.println("Name Of Company is "+name);
			System.out.println("Address Of Company is "+address);
			System.out.println("This Company Makes Ointment."+ "Put oientment in freezer");
			
			
		}

}
