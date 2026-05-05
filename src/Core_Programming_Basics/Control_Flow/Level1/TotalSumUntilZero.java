package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class TotalSumUntilZero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		boolean flag = true;
		while(flag) {
			double temp = sc.nextDouble();
			if(temp==0) flag = false;
			else total+=temp;
		}
		System.out.println(total);
	}
}