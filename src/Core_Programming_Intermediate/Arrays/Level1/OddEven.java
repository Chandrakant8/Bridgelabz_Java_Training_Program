package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class OddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0) {
			System.err.print("Not a Natual Number!");
			System.exit(0);
		}
		int size = num/2+1;
		int[] even = new int[size];
		int[] odd = new int[size];
		int idx1 = 0;
		int idx2 = 0;
		for(int i=1 ; i<=num ; i++) {
			if(i%2==0) {
				even[idx1++] = i;
			}
			else odd[idx2++] = i;
		}
		for(int i=1 ; i<=num ; i++) {
			if(i%2==0) System.out.println(even[(i/2)-1]);
			else System.out.println(odd[i/2]);
		}
	}
}