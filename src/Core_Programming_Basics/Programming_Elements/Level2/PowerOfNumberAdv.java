package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;
 
public class PowerOfNumberAdv{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		int counter = 1;
		while(counter<=power) {
			result = result * number;
			counter++;
		}
		System.out.println(result);
	}
}