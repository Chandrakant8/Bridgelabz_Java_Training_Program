package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class Age{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];
		for(int i=0 ; i<10 ; i++) {
			age[i] = sc.nextInt();
		}
		int len = age.length;
		for(int i=0 ; i<len ; i++) {
			if(age[i]<0) {
				System.out.println("Invalid Age!");
			}
			else if(age[i]>=18) {
				System.out.println("The Student with age "+age[i]+" can vote");
			}
			else System.out.println("The Student with age "+age[i]+" can not vote");
		}
		sc.close();
	}
}