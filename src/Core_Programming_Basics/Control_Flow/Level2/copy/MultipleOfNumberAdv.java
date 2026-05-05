package Core_Programming_Basics.Control_Flow.Level2.copy;

import java.util.Scanner;
 
public class MultipleOfNumberAdv{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number Should be below 100");
		int number = sc.nextInt();
		System.out.print("All Multiple of Number are : ");
		int counter = number-1;
		while(counter>1) {
			if(number%counter==0) System.out.print(counter+" ");
			counter--;
		}
	}
}