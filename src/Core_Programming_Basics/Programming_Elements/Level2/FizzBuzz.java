package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value>0 && value%3==0 && value%5==0)  System.out.println("FizzBuzz");
		else if(value>0 && value%3==0) System.out.println("Fizz");
		else if(value>0 && value%5==0) System.out.println("Buzz");
		else  System.out.println(value);
	}
}
