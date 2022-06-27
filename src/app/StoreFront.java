package app;
import app.SalableItem;
import app.InventoryManager;
import app.ShoppingCart;


public class StoreFront {

	public String shopName;
	
	/**
	 * 
	 * @param newShopName
	 */
	public StoreFront(String newShopName)
	{
		this.shopName = newShopName;
	}
	
	public static void main(String[] args) {
		// TODO Audto-generated method stub
		StoreFront Shop = new StoreFront("Test Shop");
		System.out.println("Test1");
		SalableItem Item = new SalableItem("Scissors", "Great for cutting!", (float) 12.99, 1, "Crafts");
		SalableItem Item2 = new SalableItem("Soda", "Yuck", (float) 1.99, 10, "Food");
		System.out.println("Test2");
		InventoryManager Crafts = new InventoryManager("Crafts");
		Crafts.addItems(Item);
		Crafts.addItems(Item2);
		System.out.println("Test3");
		Item.salableItemTest();
		Crafts.InventoryManagerTest1();
		Crafts.removeItems(Item2);
		Crafts.InventoryManagerTest2();
		ShoppingCart Cart = new ShoppingCart(Item);
		
		
		
		
		System.out.println("Testdone");
	
	
	
	
	}

}
