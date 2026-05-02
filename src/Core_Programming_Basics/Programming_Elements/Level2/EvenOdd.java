package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for(int i=1 ; i<=value ; i++) {
			if(i%2==0) System.out.println(i +" - Even");
			else System.out.println(i +" - Odd");
		}
	}
}