package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class NaturalNumberSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int calcSum = 0;
		int temp = number;
		if(temp>=0) {
			while(temp>0) {
				calcSum+=temp;
				temp--;
			}
			int sumByFormula = number*(number+1)/2;
			System.out.print(calcSum+" "+sumByFormula);
		}
	}
}