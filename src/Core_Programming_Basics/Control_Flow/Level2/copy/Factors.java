package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;
 
public class Factors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Factors of "+number+" are -> ");
		for(int i=1 ; i<=number ; i++) {
			if(i==number) System.out.println(i);
			else if(number%i==0) System.out.print(i+" , ");
		}
	}
}