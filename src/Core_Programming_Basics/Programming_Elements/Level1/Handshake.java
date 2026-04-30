package Core_Programming_Basics.Programming_Elements.Level1;

import java.util.Scanner;

public class Handshake{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfSt = sc.nextInt();
		int numOfHandshake = (numOfSt * (numOfSt - 1)) / 2;
		System.out.println("Possible handshake " + numOfHandshake);
	}
}