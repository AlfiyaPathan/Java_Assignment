package com.psl.training.oopdesign.customer;

public class Customer {

	int id,zip;
	String name,street,city,state;
	long cellPhone,homePhone,workPhone;
	public Customer() {
		
	}
	public Customer(String Name,int id) {
		this.id=id;
		this.name=Name;
	}
	void setPrintingAddress(String street,String city,String state,int zip){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	void setPhoneNumbers(long cellPhone,long homePhone,long workPhone){
		this.cellPhone=cellPhone;
		this.homePhone=homePhone;
		this.workPhone=workPhone;
	}
	void printPhoneNumbers() {
		System.out.println("-------Phone Numbers------");
		System.out.println("CellPhone Number is: "+cellPhone);
		System.out.println("HomePhone Number is: "+homePhone);
		System.out.println("WorkPhone Number is: "+workPhone);
		
	}
	void printShippingAdress() {
		System.out.println("---------Address---------");
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zip);
		
	}
	void printInfo() {
		System.out.print("CustomerId: "+id);
		System.out.println("------Printing All Details------");
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		printPhoneNumbers();
		printShippingAdress();
		System.out.println();
	}
}
