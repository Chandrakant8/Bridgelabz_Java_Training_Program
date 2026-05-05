package Core_Programming_Basics.Control_Flow.Level1;

import java.util.Scanner;
 
public class SpringSeason{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		if(month==3 && day>=20 && day<=31) {
			System.out.print("Spring Season");
		}
		else if(month==4 && day>0 && day<=30) {
			System.out.print("Spring Season");
		}
		else if(month==5 && day>0 && day<=31) {
			System.out.print("Spring Season");
		}
		else if(month==6 && day>0 && day<=20) {
			System.out.print("Spring Season");
		}
		else System.out.print("Not a Spring Season");
	}
}