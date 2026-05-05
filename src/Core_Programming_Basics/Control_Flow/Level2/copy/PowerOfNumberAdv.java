package Core_Programming_Basics.Control_Flow.Level2.copy;

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