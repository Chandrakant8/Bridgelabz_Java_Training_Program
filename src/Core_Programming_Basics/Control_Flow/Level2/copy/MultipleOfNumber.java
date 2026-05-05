package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;
 
public class MultipleOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number Should be below 100");
		int number = sc.nextInt();
		System.out.print("All Multiple of Number are : ");
		for(int i=100 ; i>=1 ; i--) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}