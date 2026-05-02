package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;

public class BonusOfEmployees{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int yearOfService = sc.nextInt();
		float bonus = 0f;
		if(yearOfService > 5) {
			bonus = (5/100f) * salary;
		}
		System.out.println(bonus);
	}
}