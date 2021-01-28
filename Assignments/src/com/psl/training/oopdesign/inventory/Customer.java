package com.psl.training.oopdesign.inventory;
import java.util.Scanner;

public class Customer {
int customerNumber,n,m;
String name,homePhone,cellPhone,workPhone,street,city,state,zip;
OrderItem items[]=new OrderItem[n];
Customer c[]=new Customer[m];
Scanner sc=new Scanner(System.in);
private Scanner s=new Scanner(System.in);
public Customer() {
	
}
public int getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(int customerNumber) {
	this.customerNumber = customerNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Customer(int customerNumber,String Name) {
	this.customerNumber=customerNumber;
	this.name=Name;
}
void setPrintingAddress(String street,String city,String state,String zip){
	this.street=street;
	this.city=city;
	this.state=state;
	this.zip=zip;
}
void setPhoneNumbers(String cellPhone,String homePhone,String workPhone){
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
void print() {
	System.out.print("CustomerId: "+customerNumber);
	System.out.println("------Printing All Details------");
	System.out.println("Name: "+name);
	System.out.println("Id: "+customerNumber);
	printPhoneNumbers();
	printShippingAdress();
	System.out.println();
}
void CreateFullOrder()
{
	OrderItem o = new OrderItem();
	 o.createStock();
	System.out.println("How many numbers of customers have purchase order :");
	m=sc.nextInt();
	//this.m=m;
	
	for(int j=0;j<m;j++)
	{
		 
		sc.nextLine();
		Customer c[]=new Customer[m];
		 System.out.println("Please Give Customer Details with customer purchase detail :");
		 System.out.print("Set Customer Name: ");
		 String name= sc.nextLine();
		 System.out.print("Set Custmer Id: ");
		 int custId=sc.nextInt();
		 //System.out.println(c.length);
		 c[j]=new Customer(j+1,name);
		 System.out.println("#*********************************#");
		 System.out.println("SHOW MENU");
		 o.printStockItems();
		 System.out.println("-------------------------");
		 System.out.println("How many purchase order "+c[j].name+" have: ");
		 c[j].getPurchaseOrder();
		 
		 System.out.println("#*********************************#");
		 System.out.println("Purchase order "+c[j].name+" is: ");

		 c[j].printt();
		 System.out.println("#*********************************#");
		 c[j].priceCal();
		 
	}
	
	 
}
void getPurchaseOrder() {
	
	n = sc.nextInt();
	this.n=n;
	PurchaseOrder p = new PurchaseOrder();
	items=p.getItems(n);
}
void printt()
{
	//PurchaseOrder p = new PurchaseOrder();
	//items=p.getItems(n);

	for (int i = 0; i < items.length; i++) {
		items[i].printOrderDetails();
	}
}

void priceCal()
{
	double sum=0;
	for (int i = 0; i < items.length; i++) {
		
		sum =sum+items[i].calPrice();
	}
	System.out.println("Total Price: "+sum);
}
}
