package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;
 
public class DistInYards{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distInFeet = sc.nextInt();
		float distInYard = distInFeet * 0.33f;
		double distInMiles = distInFeet * 0.000189394d;
		System.out.println("Your Distance in feet is "+ distInFeet +" while in yard is "+ distInYard +" and miles is "+ distInMiles);
	}
}