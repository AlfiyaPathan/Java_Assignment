package com.psl.training.oopdesign.shopInventory;

public class Tally extends SoftwareProduct implements Memory,OpSys{

	

	public Tally() {
		//super(ProductId, ProductName, SerialNo);
	}
	public Tally(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}
	@Override
	public void sizeOfMemory(String size) {
		
		System.out.println("Tally software requires memory at least of size: "+OsType);
	}

	@Override
	public void hasOS(String OsType) {
		
		System.out.println("Tally Software need Operating system as :  "+OsType);
	}

	@Override
	void hasLicenseKey() {
		System.out.println("Tally Software has license key");
		
	}

	@Override
	void hasPrice(long price) {
		System.out.println("this tally has price "+price);	
		
	}

}
