package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;

public class YoungestAndTallest{
	public static void main(String[] args) {
		String friend1 = "Amar";
		String friend2 = "Akbar";
		String friend3 = "Anthony";
		int age1 , age2 , age3;
		float height1 , height2 , height3;
		Scanner sc = new Scanner(System.in);
		age1 = sc.nextInt();
		age2 = sc.nextInt();
		age3 = sc.nextInt();
		height1 = sc.nextFloat();
		height2 = sc.nextFloat();
		height3 = sc.nextFloat();
		if(age1<=age2) {
			if(age1<=age3) System.out.println("Youngest among 3 friends " + friend1);
			else System.out.println("Youngest among 3 friends " + friend3);
		}
		else {
			if(age2<=age3) System.out.println("Youngest among 3 friends " + friend2);
			else System.out.println("Youngest among 3 friends " + friend3);
		}
		if(height1>=height2) {
			if(height1>=height3) System.out.println("Tallest among 3 friends " + friend1);
			else System.out.println("Tallest among 3 friends " + friend3);
		}
		else {
			if(height2>=height3) System.out.println("Tallest among 3 friends " + friend2);
			else System.out.println("Tallest among 3 friends " + friend3);
		}
	}
}