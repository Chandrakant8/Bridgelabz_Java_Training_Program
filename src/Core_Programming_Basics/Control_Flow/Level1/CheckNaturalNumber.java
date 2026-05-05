package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class CheckNaturalNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>=0) {
			int sum = number*(number+1)/2;
			System.out.print("The sum of "+number+" natural numbers is "+ sum);
		}
		else System.out.print("The number "+number+" is not a natural number");
	}
}