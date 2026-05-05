package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class FactorialByForLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		for(int i=2 ; i<=number ; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}
}