package DesignPatterns.StructuralPattern.DecoratorDesignPattern;

interface Coffee{
	String getDescription();
	double getCost();
}

class PlainCoffee implements Coffee{
	@ Override
	public String getDescription() {
		return "Plain Coffee";
	}
	
	@ Override
	public double getCost() {
		return 2.0;
	}
}

abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}
	
	public double getCost() {
		return decoratedCoffee.getCost();
	}
}

class MilkDecorator extends CoffeeDecorator{
	public MilkDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	@ Override
	public String getDescription() {
		return decoratedCoffee.getDescription()+", Milk";
	}
	
	@ Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.5;
	}
}

class SugarDecorator extends CoffeeDecorator{
	public SugarDecorator(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	@ Override
	public String getDescription() {
		return decoratedCoffee.getDescription()+", Sugar";
	}
	
	@ Override
	public double getCost() {
		return decoratedCoffee.getCost() + 0.5;
	}
}

class CoffeeDec{
	public static void main(String[] args) {
		Coffee plainCoffee = new PlainCoffee();
		System.out.println(plainCoffee.getDescription());
		System.out.println(plainCoffee.getCost());
		
		Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
		System.out.println(milkCoffee.getDescription());
		System.out.println(milkCoffee.getCost());
		
		Coffee sugarCoffee = new MilkDecorator(new PlainCoffee());
		System.out.println(sugarCoffee.getDescription());
		System.out.println(sugarCoffee.getCost());
	}
}