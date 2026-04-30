package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class TotalPrice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int unitPrice = sc.nextInt();
		int boughtQuant = sc.nextInt();
		int totalPrice = unitPrice  * boughtQuant;
		System.out.println("The total purchase price is INR "+ totalPrice +" if the quantity "+ boughtQuant +" and unit price is INR "+ unitPrice);
	}
}