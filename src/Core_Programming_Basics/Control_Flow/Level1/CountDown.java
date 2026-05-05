package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class CountDown{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		while(temp>=1) {
			System.out.println(temp);
			temp--;
		}
	}
}