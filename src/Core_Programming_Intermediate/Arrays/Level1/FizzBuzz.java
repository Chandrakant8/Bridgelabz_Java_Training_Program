package Core_Programming_Intermediate.Arrays.Level1;

import java.util.*;

public class FizzBuzz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] res = new String[num+1];
		int idx = 0;
		if(num>=0) {
			for(int i=0 ; i<=num ; i++) {
				if(i%3==0 && i%5==0) res[idx++] = "FizzBuzz";
				else if(i%3==0) res[idx++] = "Fizz";
				else if(i%5==0) res[idx++] = "Buzz";
				else res[idx++] = i+"";
			}
		}
		for(int i=0 ; i<=num ; i++) {
			System.out.println("Position "+i+" = "+res[i]);
		}
	}
}