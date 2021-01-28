package com.psl.training.exception.handling;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	static void ValidateFirstName(String name,String middle,String date,String email)throws ValidationException
	{
		
				if((name==null || name.isEmpty()))
			
					throw new ValidationException("Please write your first name/first name not provided");
				
				if(middle==null || middle.isEmpty())
					throw new ValidationException("Please write your middle name/middle name not provided ");
				
				if(date==null || date.isEmpty())
					throw new ValidationException("Please write your birth date / do not keep empty\n");
				
				if(email==null || email.isEmpty())
					throw new ValidationException("Please write your email/email not provided ");
			
		
		
	}
	
	static void OneNumberMustValidate(String phone ,String mobile) throws ValidationException{
		
		if((phone==null || phone.isEmpty())&&(mobile==null || mobile.isEmpty()))
			
				throw new ValidationException("Please provide at least phone number or mobile number");
			
	}
	
	static void CheckEmailFormat(String email) throws ValidationException {
		
		String format="^(.+)@(\\S+)$";
		Pattern p=Pattern.compile(format);
		Matcher match=p.matcher(email);
		
				if(!match.matches())
					throw new ValidationException("You have Provided: "+email+"\nPlease provide at email in right format as 'example@gmail.com'");
		
	}
	
	
	
}
