package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class SmallestAmongThree{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		boolean flag = number1<number2 && number1<number3 ? true : false;
		System.out.println("Is the first number the smallest? "+ flag);
	}
}