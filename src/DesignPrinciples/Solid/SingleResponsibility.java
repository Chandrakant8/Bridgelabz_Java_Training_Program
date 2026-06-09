package DesignPrinciples.Solid;

class BreadBaker{
	public void bakeBread() {
		System.out.println("Baking high quality bread...");
	}
}

class InventoryManager{
	public void manageInventory() {
		System.out.println("Managing inventory...");
	}
}

class SupplyOrder{
	public void orderSupplies() {
		System.out.println("Ordering supplies...");
	}
}

class CustomerService{
	public void serveCustomer() {
		System.out.println("Serving customer...");
	}
}

class BakeryCleaner{
	public void cleanBakery() {
		System.out.println("Cleaning the bakery...");
	}
}

class SingleResponsibility{
	public static void main(String[] args) {
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