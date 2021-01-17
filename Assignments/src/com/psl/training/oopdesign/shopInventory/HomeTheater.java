package com.psl.training.oopdesign.shopInventory;

public class HomeTheater extends HardwareProduct {
	
	
	public HomeTheater() {
		//super(ProductId, ProductName, SerialNo);
	}
	public HomeTheater(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}
	@Override
	void brandOfProduct(String brand) {
		System.out.println("this home theator is  brand of "+brand);	
		
	}
void hasBattery() {
		
		System.out.println("Home theator has special battery in case no power supply");	
	}
	void BatteryBackUp ()
	{
		System.out.println("We have provided home theater with some battery backup ");	
	}
	@Override
	void hasPrice(long price) {
		System.out.println("Every Hardware Product has price "+price);	
		
	}
	
	

}
