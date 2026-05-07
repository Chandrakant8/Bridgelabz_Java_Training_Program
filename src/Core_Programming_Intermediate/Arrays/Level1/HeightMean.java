package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class HeightMean{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] height = new double[11];
		// take height of players from user
		for(int i=0 ; i<11 ; i++) {
			height[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int i=0 ; i<11 ; i++) {
			sum+=height[i];
		}
		// calculate mean of football players height
		double mean = sum/11;
		// display mean of football players height
		System.out.println("mean height of football team is : "+mean);
		sc.close();
	}
}