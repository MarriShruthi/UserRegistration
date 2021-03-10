package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhnNum {
	
	Scanner sc=new Scanner(System.in);
	void checkno() {
		// TODO Auto-generated method stub
		    System.out.println("enter the phone number (number is in its country code as +91 and must be followed by 10 digit number) : ");
		    String phone=sc.next();
		    String regex="[+91]{3}[0-9]{10}";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(phone);
			 boolean m1=m.matches();
			 System.out.println(m1);
			 if (m1==false)
			 {
				 
				 System.out.println("please retry in correct format");
				 checkno();
				 
			 }
			 
			 else
			 {
				 System.out.println("your contact number : "+phone);
			 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidPhnNum().checkno();
	}

}


