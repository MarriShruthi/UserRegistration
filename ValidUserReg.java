package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserReg {
	
	static Scanner sc= new Scanner(System.in);
	
	void checkName(){
		
		System.out.println("enter your name (please enter first letter in captical input of name min 3 letter and max 10 : ");
		System.out.println();
		String firstName=sc.next(); 
		
		String regex="[A-Z]{1}[a-z]{2,10}$";
		Pattern p = Pattern.compile(regex);
		
		 Matcher m = p.matcher(firstName);
		 boolean m1=m.matches();
		 System.out.println(m1);
		
		 if (m1==false)
		 {
			 
			 System.out.println(" please retry in correct format");
			 checkName();
			 
		 }
		 
		 else
		 {
			 System.out.println("your name "+firstName);
		 }
	}
		
		 
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
							
			 void checkpassword() 
			 {		
					 // TODO Auto-generated method stub
					 System.out.println("enter the password (password must have atleast one upper case, one lower case, one special character like @ # & $"
												            + ",one nummeric character, length of password min 8 to max 12):");
					 System.out.println("warning Max 3 attempts only");
					 int count=0, attempt=0;
					 for(int i= 0; i<3 ; i++)
					 {
						    String password=sc.next();
						    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{8,12}$";
						    Pattern p = Pattern.compile(regex);
							 Matcher m = p.matcher(password);
							 boolean m1=m.matches();
							 System.out.println(m1);
							 count+=1;
							 attempt=3-count;
							 if (m1==false)
							 {
												 
									 System.out.println("Invalid password");
									 System.out.println("please try again ");
									 System.out.println("you have used "+count+" attempts, left  with "+attempt+" attempts");
									 continue;
												 
							 }
											 
							 else
							 {
									 System.out.println("your password "+password);
												
									 System.out.println("please Re-enter the correct password");
									 String password2=sc.next();
									 if(password2.contains(password))
									 {
										 System.out.println("you have succesfully set your password ");
													
									 }
									 else
									 {
										 System.out.println("enter the password again");
										 continue;
									 }
									 break;
							 }
					 }
				 }
				
											
public static void main(String[] args) {
	// TODO Auto-generated method stub
	new ValidUserReg().checkName();
	new ValidUserReg().checkName();
	new ValidUserReg().checkmail();
	new ValidUserReg().checkno();
	new ValidUserReg().checkpassword();
	 System.out.println("Thank You! Succesfully Registered");
}
}
		

											

