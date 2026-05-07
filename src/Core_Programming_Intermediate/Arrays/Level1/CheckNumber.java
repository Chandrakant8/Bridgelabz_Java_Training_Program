package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class CheckNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		for(int i=0 ; i<5 ; i++) {
			number[i] = sc.nextInt();
		}
		int len = number.length;
		for(int i=0 ; i<len ; i++) {
			if(number[i]<0) {
				System.out.println("Negative");
			}
			else if(number[i]==0) {
				System.out.println("Zero");
			}
			else {
				if(number[i]%2==0) {
					System.out.println("Even");
				}
				else {
					System.out.println("Odd");
				}
			}
		}
		if(number[0]==number[len-1]) System.out.println("Equal");
		else if(number[0]<number[len-1]) System.out.println("Less");
		else System.out.println("Greater");
		sc.close();
	}
}