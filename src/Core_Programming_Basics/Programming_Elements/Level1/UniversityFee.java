package Core_Programming_Basics.Programming_Elements.Level1;
public class UniversityFee{
	public static void main(String[] args) {
		int fee = 125000;
		int discountPercent = 10;
		float discount = ((discountPercent/100f) * fee);
		int discountFee = fee - (int) discount;
		System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+ discountFee);
	}
}