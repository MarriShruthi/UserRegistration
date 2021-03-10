package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLastName {
	
	Scanner sc=new Scanner(System.in);
	void checkName(){
		
		System.out.println("enter your last name (please enter first letter in captical and  min 3 letter and maximum 10 is accepted):");
		System.out.println();
		String lastName=sc.next(); 
		
		String regex="[A-Z]{1}[a-z]{2,10}$";
		Pattern p = Pattern.compile(regex);
		
		 Matcher m = p.matcher(lastName);
		 boolean m1=m.matches();
		 System.out.println(m1);
		
		 if (m1==false)
		 {
			 
			 System.out.println(" please retry in correct format");
			 checkName();
			 
		 }
		 
		 else
		 {
			 System.out.println("your last name "+lastName);
			 
		 }

}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidLastName().checkName();
		
}
}


