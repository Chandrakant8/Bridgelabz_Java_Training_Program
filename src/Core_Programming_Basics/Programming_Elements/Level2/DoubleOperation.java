package Core_Programming_Basics.Programming_Elements.Level2;

import java.util.*;

public class DoubleOperation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double res1 = a+b*c;
		double res2 = a*b+c;
		double res3 = c+a/b;
		double res4 = a%b+c;
		System.out.println(res1+" "+res2+" "+res3+" "+res4);
	}
}