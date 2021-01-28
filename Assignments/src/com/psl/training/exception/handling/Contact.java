package com.psl.training.exception.handling;

public class Contact {
	
	String Firstname, Middlename, Lastname; 
	String Datebirth, Gender, Anniversary, Address, Area, City, Pincode, State, Country;
	String TelephoneNumber, MobileNumber, Email, Website;
	int size;
	
	public Contact(String Firstname,String Middlename,String Lastname){
		this.Firstname=Firstname;
		this.Middlename=Middlename;
		this.Lastname=Lastname;
		
	}
	public Contact(int size) {
		this.size=size;
	}
	
	void setInfo(String Datebirth,String  Gender, String Anniversary )
	{
		this.Datebirth=Datebirth;
		this.Gender=Gender;
		this.Anniversary=Anniversary;
		
	}
	
	void setAddress( String Address, String Area, String City, String Pincode,String  State, String Country )
	{
		this.Address=Address;
		this.Area=Area;
		this.City=City;
		this.Pincode=Pincode;
		this.State=State;
		this.Country=Country;

	}
	
	void setPhoneNEmail(String TelephoneNumber, String MobileNumber, String Email, String Website) {
		
		this.TelephoneNumber=TelephoneNumber;
		this.MobileNumber=MobileNumber;
		this.Email=Email;
		this.Website=Website;
		
	}
	
	String getFirstName() {
		
		return Firstname;
	}
	String getMiddleName() {
			
			return Middlename;
		}
	String getDateOfBirth() {
		
		return Datebirth;
	}
	String getEmail()
	{
		return Email;
	}

	void validate()throws ValidationException {
		Validate.ValidateFirstName(getFirstName(),getMiddleName(),getDateOfBirth(),getEmail());
		Validate.OneNumberMustValidate(TelephoneNumber, MobileNumber);
		Validate.CheckEmailFormat(Email);
	}
	

}
