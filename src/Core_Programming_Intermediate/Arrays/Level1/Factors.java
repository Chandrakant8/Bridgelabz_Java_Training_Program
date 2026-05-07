package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class Factors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int idx = 0;
		for(int i=1 ; i<=num ; i++) {
			if(num%i==0) {
				if(idx==maxFactor) {
					maxFactor*=2;
					int[] temp = Arrays.copyOf(factors,maxFactor);
					factors = temp;
				}
				factors[idx++] = i;
			}
		}
		for(int i=0 ; i<maxFactor ; i++) {
			if(i==0) System.out.print(factors[i]);
			if(factors[i]!=0) System.out.print(" , "+factors[i]);
		}
		sc.close();
	}
}