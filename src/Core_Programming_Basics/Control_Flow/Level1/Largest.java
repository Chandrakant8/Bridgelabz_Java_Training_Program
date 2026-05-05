package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class Largest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		boolean flag1,flag2,flag3;
		flag1=flag2=flag3 = false;
		if(number1>number2) {
			if(number1>number3) {
				flag1 = true;
			}
			else flag3 = true;
		}
		else {
			if(number2>number3) flag2 = true;
			else flag3 = true;
		}
		System.out.println("Is the first number the largest? "+ flag1);
		System.out.println("Is the second number the largest? "+ flag2);
		System.out.println("Is the third number the largest? "+ flag3);
	}
}