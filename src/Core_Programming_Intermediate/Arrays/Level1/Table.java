package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class Table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take number input from user
		int number = sc.nextInt();
		int[] res = new int[10];
		// store value in res array after multiplication
		for(int i=1 ; i<=10 ; i++) {
			res[i-1] = number*i;
		}
		// print table 
		for(int i=0 ; i<10 ; i++) {
			System.out.println(number+" * "+(i+1)+" = "+res[i]);
		}
		sc.close();
	}
}