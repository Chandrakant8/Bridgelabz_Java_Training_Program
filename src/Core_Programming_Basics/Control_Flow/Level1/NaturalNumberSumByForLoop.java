package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class NaturalNumberSumByForLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int calcSum = 0;
		if(number>=0) {
			for(int i=1 ; i<=number ; i++) {
				calcSum+=i;
			}
			int sumByFormula = number*(number+1)/2;
			System.out.print(calcSum+" "+sumByFormula);
		}
	}
}