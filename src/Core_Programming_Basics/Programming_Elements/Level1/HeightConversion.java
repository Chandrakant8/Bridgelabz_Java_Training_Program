package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class HeightConversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heightCm = sc.nextInt();
		float heightInches = heightCm * 0.3937f;
		float heightFeet = heightCm * 0.0328f;
		System.out.println("Your Height in cm is "+ heightCm +" while in feet is "+ heightFeet +" and inches is "+ heightInches);
	}
}