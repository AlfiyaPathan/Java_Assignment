package com.psl.training.oopdesign.shopInventory;

public abstract class HardwareProduct extends Product {

	
	public HardwareProduct() {
		
	}
	
	public HardwareProduct(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
		System.out.println("*****In Hardware Product class constructor******");
		System.out.println("ProductId : "+ProductId);
		System.out.println("ProductName : "+ProductName);
		System.out.println("Product Serial Number : "+SerialNo);
	}
	abstract void brandOfProduct(String brand);
	void hasBattery() {
		
		System.out.println("Some Hardware Requires Battery But not all");	
	}
	void BatteryBackUp ()
	{
		System.out.println("Some Hardware product has Battery Backup ");	
	}
}
