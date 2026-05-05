package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for(int i=1 ; i<=value ; i++) {			
			if(i>0 && i%3==0 && i%5==0)  System.out.println("FizzBuzz");
			else if(i>0 && i%3==0) System.out.println("Fizz");
			else if(i>0 && i%5==0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}
}
