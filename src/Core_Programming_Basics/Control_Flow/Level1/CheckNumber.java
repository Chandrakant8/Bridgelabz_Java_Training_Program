package Core_Programming_Basics.Control_Flow.Level1;

import java.util.*;

public class CheckNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) System.out.println("Negative");
		else if(num==0) System.out.println("Zero");
		else System.out.println("Positive");
	}
}