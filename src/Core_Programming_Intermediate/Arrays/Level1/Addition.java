package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class Addition{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		double total = 0.0;
		int idx = 0;
		// take input from user till user enters 0 , negative number or index reached to array length. 
		while(true) {
			if(idx==10) break;
			double t = sc.nextDouble();
			if(t<=0) {
				break;
			}
			arr[idx++] = t;
		}
		// add element in total
		for(int i=0 ; i<10 ; i++) {
			total+=arr[i];
		}
		// display total
		System.out.println("Total Value : "+total);
	}
}