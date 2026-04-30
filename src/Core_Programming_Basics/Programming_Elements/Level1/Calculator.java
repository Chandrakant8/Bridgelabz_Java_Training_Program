package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float add = num1 + num2;
		float subtract = num1 - num2;
		float multiply = num1 * num2;
		float divide = num1 / num2;
		System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %f and %f is %.2f, %.2f, %.2f and %.2f",num1,num2,add,subtract,multiply,divide);
	}
}