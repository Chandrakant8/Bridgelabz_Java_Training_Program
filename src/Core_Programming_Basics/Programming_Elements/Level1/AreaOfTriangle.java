package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baseInCm = sc.nextInt();
		int heightInCm = sc.nextInt();
		float areaInCm = 1/2f * baseInCm * heightInCm;
		float baseInInches = baseInCm * 0.3937f;
		float heightInInches = heightInCm * 0.3937f;
		float areaInInches = 1/2f * baseInInches * heightInInches;
		System.out.println("Area Of Triangle in Cm is "+ areaInCm + " and in Inches is "+ areaInInches);
	}
}