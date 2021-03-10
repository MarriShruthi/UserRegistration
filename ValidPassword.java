package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
	
Scanner sc= new Scanner(System.in);
	
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
		new ValidPassword().checkpassword();
		

	}

}


