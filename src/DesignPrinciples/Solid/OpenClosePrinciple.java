package DesignPrinciples.Solid;

abstract class PaymentProcessor{
	public abstract void processPayment(double amount);
}

class CreditCardPaymentProcessor extends PaymentProcessor{
	@ Override
	public void processPayment(double amount) {
		System.out.println("Process Paymet via Credit Card $ "+ amount);
	}
}

// extended functionality
class PayPalPaymentProcessor extends PaymentProcessor{
	@ Override
	public void processPayment(double amount) {
		System.out.println("Process Paymet via Pay-Pal $ "+ amount);
	}
}

class OpenClosePrinciple{
	public static void main(String[] args) {
		PaymentProcessor p1 = new CreditCardPaymentProcessor();
		PaymentProcessor p2 = new PayPalPaymentProcessor();
		
		p1.processPayment(500);
		p2.processPayment(1000);
		
		processPayment(p1,500);
		processPayment(p2,1000);
	}
	public static void processPayment(PaymentProcessor processor, int amount) {
		processor.processPayment(amount);
	}
}