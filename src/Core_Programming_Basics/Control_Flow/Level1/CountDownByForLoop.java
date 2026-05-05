package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class CountDownByForLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=number ; i>=1 ; i--) {
			System.out.println(i);
		}
	}
}