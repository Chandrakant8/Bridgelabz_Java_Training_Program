package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;
 
public class FactorsAdv{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Factors of "+number+" are -> ");
		int counter = 1;
		while(counter<number) {
			if(number%counter==0) System.out.print(counter+" "); 
			counter++;
		}
	}
}