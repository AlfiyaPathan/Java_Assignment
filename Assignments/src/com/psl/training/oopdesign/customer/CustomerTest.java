package com.psl.training.oopdesign.customer;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer c1=new Customer("Manasi",101);
		c1.setPhoneNumbers(1234567890, 9134562708L, 9087654312L);
		c1.setPrintingAddress("Santaji Road", "Ahemadnagar", "Maharashtra", 340124);
		c1.printInfo();
		
		Customer c2 =new Customer("Ravi",102);
		c2.setPhoneNumbers(1234567890, 9134562708L, 9087654312L);
		c2.setPrintingAddress("Tilak Road", "Pune", "Maharashtra", 340124);
		c2.printInfo();
		
		Customer c3 =new Customer("Zan",103);
		c3.setPhoneNumbers(9834567890l, 91309562708L, 9087654312L);
		c3.setPrintingAddress("Aund Road", "Pune", "Maharashtra", 340124);
		c3.printInfo();
		
		
		
	}

}
