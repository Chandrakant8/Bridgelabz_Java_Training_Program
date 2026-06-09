package DesignPrinciples.Solid;
import java.util.*;

interface IVegetarianMenu{
	List<String> getVegetarianItems();
}

interface INonVegetarianMenu{
	List<String> getNonVegetarianItems();
}

interface IDrinkMenu{
	List<String> getDrinkItems();
}

class VegetarianMenu implements IVegetarianMenu{
	public List<String> getVegetarianItems(){
		return Arrays.asList("Vegetable Curry","Paneer Tikka", "Salad");
	}
}

class NonVegetarianMenu implements INonVegetarianMenu{
	public List<String> getNonVegetarianItems(){
		return Arrays.asList("Fish fry","Biriyani", "Chicken Curry");
	}
}

class DrinkMenu implements IDrinkMenu{
	public List<String> getDrinkItems(){
		return Arrays.asList("Water","Soda", "Juice");
	}
}

class MenuDisplay{
	public static void displayVegetarianMenu(VegetarianMenu v) {
		for(String item : v.getVegetarianItems()) {
			System.out.println(item);
		}
	}
	public static void displayNonVegetarianMenu(NonVegetarianMenu v) {
		for(String item : v.getNonVegetarianItems()) {
			System.out.println(item);
		}
	}
}

class InterfaceSegregationPrinciple{
	public static void main(String[] args) {
		VegetarianMenu veg = new VegetarianMenu();
		NonVegetarianMenu nonVeg = new NonVegetarianMenu();
		DrinkMenu drink = new DrinkMenu();
		
		MenuDisplay.displayVegetarianMenu(veg);
		MenuDisplay.displayNonVegetarianMenu(nonVeg);
	}
}