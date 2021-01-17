package com.psl.training.oopdesign.shopInventory;

public class CarDeck extends HardwareProduct{

	public CarDeck() {
		//super(ProductId, ProductName, SerialNo);
	}
	public CarDeck(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}
	@Override
	void brandOfProduct(String brand) {
		System.out.println("Car Deck brand is "+brand);	
		
	}
	void hasBattery() {
		
		System.out.println("Car Deck works on car Battery ");	
	}
	@Override
	void hasPrice(long price) {
		System.out.println("Car Deck has price "+price);	
		
	}

	
	
}
