package com.psl.training.exception.handling;

public class Stack {

	int size,top=-1;
	private Contact[] contacts;
	
	void setSize(int size){
		this.size=size;
	}
	int getSize()
	{
		return size;
	}
	Stack()
	{
		contacts=new Contact[this.size];
	}
	Stack(int size)
	{
		this.size=size;
		contacts=new Contact[size];
	}
	void push(Contact c) {
		try {
			
			if(top==(this.size-1)) {
				
				throw new StackException("Stack is full. Cannot insert more contacts");
			}
			else {
				try {
				c.validate();
				this.contacts[++top]=c;
				System.out.println("Contact is validated. ");
				System.out.println("Contact Pushed with first name : "+c.Firstname);
			}catch(ValidationException e) {
				System.out.print(e.getMessage());
			}}
			
		}
		catch(StackException s) {
			System.out.println(s.getMessage());	
		}
	}
	
	public Contact pop()
	{
			try {
				if(top==-1)
				throw new StackException("Stack is empty. Cannot pop or delete contacts");
				else {
					System.out.println("Contact Deleted"+top);
				return contacts[top--];
				}
				
			} catch (StackException s) {
				System.out.println(s.getMessage());	
				return null;
			}
		
	}
	
}
