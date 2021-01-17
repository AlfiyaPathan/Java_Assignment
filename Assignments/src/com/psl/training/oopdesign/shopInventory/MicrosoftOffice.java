package com.psl.training.oopdesign.shopInventory;

public class MicrosoftOffice extends SoftwareProduct implements OpSys,Memory{
	
	public MicrosoftOffice() {
		//super(ProductId, ProductName, SerialNo);
	}
	public MicrosoftOffice(int ProductId, String ProductName, String SerialNo) {
		super(ProductId, ProductName, SerialNo);
	}

	@Override
	public void hasOS(String OsType) {
		System.out.println("This Microsoft require OS of type: "+OsType);
		
	}

	@Override
	public void sizeOfMemory(String size) {
	
		System.out.println("This Microsoft require Memory of size: "+size);

	}

	@Override
	void hasLicenseKey() {
		System.out.println("This Microsoft has license key ");

		
	}

	@Override
	void hasPrice(long price) {
		System.out.println("This microsoft has price "+price);	
		
	}

}
