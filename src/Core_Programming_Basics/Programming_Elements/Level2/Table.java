package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.Scanner;

public class Table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value From 6 To 9");
		int value = sc.nextInt();
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(value+" * "+i+" = "+ value*i);
		}
	}
}