package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMail {
	
Scanner sc= new Scanner(System.in);
	
	
	void checkmail()
	{
		System.out.println("Enter your Email (Example abc@def.com) : ");
		String email=sc.next();
		    String regex="[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(email);
			 boolean m1=m.matches();
			 System.out.println(m1);
		
			 if (m1==false)
			 {
				 
				 System.out.println("please retry in correct format");
				 checkmail();
				 
			 }
			 
			 else
			 {
				 System.out.println("your email is "+email);
			 }
			
			
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidMail().checkmail();

	}

}

