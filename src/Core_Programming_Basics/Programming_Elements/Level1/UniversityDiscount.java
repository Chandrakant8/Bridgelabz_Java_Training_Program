package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class UniversityDiscount{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		int discountPercent = sc.nextInt();
		float discount = ((discountPercent/100f) * fee);
		int discountFee = fee - (int) discount;
		System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+ discountFee);
	}
}