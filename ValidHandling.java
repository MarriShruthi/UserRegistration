package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHandling 
{
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	String msg;
		public ValidHandling(String msg)
		{
			this.msg = msg;
		}
		public String checkName() throws UserAnalyser
		{
			System.out.println("enter your first name (please enter first letter in captical input of name min 3 letter and max 10 : ");
			System.out.println();
			String firstName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(firstName);
			boolean m1=m.matches();
			System.out.println(m1);
			
			try
			{
				if (m1==true)
				{
					return "your name "+firstName;
				}
				else
				{
					return "invalid inputs in name please renter in the correct format";
				}
			 }
			 catch(Exception e)
			{
				 throw new UserAnalyser("invalid input from you");
			}
			
		}
		public String checkno()
		{
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
					 return "please retry in the correct format";
				 }
				 else
				 {
					 return "your contact number "+phone;
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
				System.out.println("please retry in the correct format");
			}
			else
			{
				System.out.println("your email is "+email);
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
			    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
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
						 System.out.println("you have succesfully set your password and made an account");
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
		static void end()
        {
			System.out.println("thank you");
			exit=true;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(!exit)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter your choice to fill the details for registrartion");
			System.out.println("1. Enter for First name");
			System.out.println("2. Enter for Last name");
			System.out.println("3. Enter for Contact Number");
			System.out.println("4. Enter for Email Address");
			System.out.println("5. Enter for Password");
			System.out.println("6. Finish And Exit ");
			int choice=s.nextInt();
			
			switch(choice)
			{
				case 1:
        	 
					ValidHandling vh= new ValidHandling(null);
					try
					{
							System.out.println(vh.checkName());
					}
					catch(UserAnalyser e1)
					{
						e1.printStackTrace();
					}
					break;
        	 
				case 2:
        	 
					new ValidUserReg().checkName();
					break;
        	 
				case 3:
        	 
					new ValidUserReg().checkno();
					break;
        	 
				case 4:
					new ValidUserReg().checkmail();
        	 		break;
        	 
				case 5:
        	 
					new ValidUserReg().checkpassword();
					break;
        	 
				case 6:
					end();
				}
		}
  	}
}
