package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StrongPassword{
	public static void main(String[] args) {
		
		// take scanner class object to take input...
		Scanner sc = new Scanner(System.in);
		
		// Expression for Strong_Password...
		String exp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#%&*])(?=.*[0-9])[a-zA-Z!@#%&*0-9]+$";
		
		System.out.println("Enter your password : ");
		String password = sc.nextLine();
		System.out.println("password : "+password);
		
		
		Pattern p = Pattern.compile(exp);
		Matcher match = p.matcher(password);
		boolean isValid = match.matches();
		
		// print statement if Password is strong or not...
		if(isValid) System.out.print("Strong Password!");
		else System.out.print("Weak Password!");
	}
}