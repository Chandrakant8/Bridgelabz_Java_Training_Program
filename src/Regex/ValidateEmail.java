package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateEmail{
	public static void main(String[] args) {
		
		// take scanner class object to take input...
		Scanner sc = new Scanner(System.in);
		
		// Expression for email validation...
		String exp = "^[a-zA-Z0-9_.]+@[a-zA-Z]+.[a-zA-Z]{3}$";
		
		System.out.println("Enter your email : ");
		String email = sc.nextLine();
		System.out.println("email : "+email);
		
		
		Pattern p = Pattern.compile(exp);
		Matcher match = p.matcher(email);
		boolean isValid = match.matches();
		
		// print statement if email is valid or not...
		if(isValid) System.out.print("Email is Valid");
		else System.out.print("Email is not Valid");
	}
}