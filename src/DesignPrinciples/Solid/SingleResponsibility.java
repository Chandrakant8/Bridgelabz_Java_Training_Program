package DesignPrinciples.Solid;

//class for Baking Bread
class BreadBaker{
	public void bakeBread() {
		System.out.println("Baking high quality bread...");
	}
}

// class for Managing Inventory
class InventoryManager{
	public void manageInventory() {
		System.out.println("Managing inventory...");
	}
}

// class for Supply Order
class SupplyOrder{
	public void orderSupplies() {
		System.out.println("Ordering supplies...");
	}
}

// class for Customer Service
class CustomerService{
	public void serveCustomer() {
		System.out.println("Serving customer...");
	}
}

// class for Bakery Cleaner
class BakeryCleaner{
	public void cleanBakery() {
		System.out.println("Cleaning the bakery...");
	}
}

class SingleResponsibility{
	public static void main(String[] args) {
		
		// here instance of each class that shows only one responsibility of each class
		
		BreadBaker b = new BreadBaker();
		InventoryManager m = new InventoryManager();
		SupplyOrder s = new SupplyOrder();
		CustomerService c = new CustomerService();
		BakeryCleaner bk = new BakeryCleaner();
		
		b.bakeBread();
		m.manageInventory();
		s.orderSupplies();
		c.serveCustomer();
		bk.cleanBakery();
	}
}