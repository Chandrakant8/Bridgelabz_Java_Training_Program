package DesignPrinciples;

class DryPrinciples{
	
	// Without DRY (duplicate logic)
	
	public static boolean validateEmail1(String e) {
		return e.contains("@") && e.contains(".");
	}
	
	public static boolean validateEmail2(String e) {
		return e.contains("@") && e.contains(".");
	}
	
	// With DRY (single reusable function)
	
	public static boolean validateEmail(String e) {
		return e.contains("@") && e.contains(".");
	}
	
	public static void main(String[] args) {
		String s1 = "chandrakant@gmail.com";
		String s2 = "chandrakantgmail.com";
		
		System.out.println(validateEmail1(s1));
		System.out.println(validateEmail2(s2));
		
		System.out.println(validateEmail(s1));
	}
}