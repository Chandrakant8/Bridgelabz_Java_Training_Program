package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class CheckDivisible{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = number%5==0 ? true : false;
		System.out.println("Is the number "+number+" divisible by 5? "+flag);
	}
}