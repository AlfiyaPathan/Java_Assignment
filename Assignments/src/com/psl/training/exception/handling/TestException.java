package com.psl.training.exception.handling;



public class TestException {

	public static void main(String args[]) {
	
		Contact c=new Contact("sam","abc","Turner");
		c.setPhoneNEmail(null, "9871234560", "abc@gmail.com", "www.abc.com");
		c.setInfo("05/12/2009", "male", "NA");
		
		Contact c1=new Contact("hobi","abc","harrington");
		c1.setPhoneNEmail( "9871234560",null, "hobi123@gmail.com", "www.abc.com");
		c1.setInfo("05/12/2009", "male", "NA");
		
		Contact c2=new Contact("Sophie","aoyr","harrington");
		c2.setPhoneNEmail( "9871234560",null, "hodujfh@gmail.com", "www.abc.com");
		c2.setInfo(null, "female", "NA");
		
		Stack s=new Stack(3);
		s.push(c);
		s.push(c1);
		s.push(c2);
		s.push(c);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
}}

