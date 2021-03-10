package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidName {
	
	Scanner sc=new Scanner(System.in);
	void checkName(){
		
		System.out.println("enter your first name (please enter first letter in captical input of name min 3 letter and max 10 : ");
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidName().checkName();
		

	}

}

