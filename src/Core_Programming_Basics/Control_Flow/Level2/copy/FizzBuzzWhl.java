package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;

public class FizzBuzzWhl{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int temp = 1;
		while(value>0 && temp<=value) {
			if(temp%3==0 && temp%5==0)  System.out.println("FizzBuzz");
			else if(temp%3==0) System.out.println("Fizz");
			else if(temp%5==0) System.out.println("Buzz");
			else System.out.println(temp);
			temp++;
		}
	}
}