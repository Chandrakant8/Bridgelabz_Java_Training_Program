package Core_Programming_Basics.Programming_Elements.Level1;
public class AvgPercent{
	public static void main(String[] args) {
		int maths = 94;
		int physics = 95;
		int chemistry = 82;
		float avg = ((maths + physics + chemistry)/3f);
		System.out.println("Sam’s average mark in PCM is "+ avg);
		System.out.printf("Sam’s average mark in PCM is %.2f", avg);
	}
}