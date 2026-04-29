package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class kilometerToMiles{
	public static void main(String[] args) {
		double km;
		Scanner sc = new Scanner(System.in);
		km = sc.nextDouble();
		double miles = km * 0.62f;
		System.out.println("The total miles is "+ miles +" mile for the given "+ km +" km");
	}
}