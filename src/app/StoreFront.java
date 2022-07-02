package app;
import app.SalableItem;
import app.InventoryManager;
import app.ShoppingCart;

import java.util.Scanner;



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
		Scanner input = new Scanner(System.in);
		StoreFront Shop = new StoreFront("Test Shop");
		
		
		/* 
		System.out.println("Test1");
		SalableItem Item = new SalableItem("Scissors", "Great for cutting!", (float) 12.99, 1);
		SalableItem Item2 = new SalableItem("Soda", "Yuck", (float) 1.99, 10);
		System.out.println("Test2");
		InventoryManager craftDept = new InventoryManager("craftDept");
		craftDept.addItems(Item);
		craftDept.addItems(Item2);
		System.out.println("Test3");
		Item.salableItemTest();
		craftDept.InventoryManagerTest1();
		craftDept.removeItems(Item2);
		craftDept.InventoryManagerTest2();
		craftDept.addItems(Item);
		*/


		/* 
		SalableItem longSword = new SalableItem("Long Sword", "A nice shiny Long Sword!", (float) 50, 2);
		SalableItem maceItem = new SalableItem("Mace", "A heavy spiky mace!", (float) 25, 5);
		
		InventoryManager Weapons = new InventoryManager("Weapons");
		Weapons.addItems(longSword);
		Weapons.addItems(maceItem);
		*/


		Armor chainMail = new Armor("Chain Mail", "Made of Mithril", (float) 150, 1);
		Armor plateMail = new Armor("Plate Mail", "Plated Mail!", (float) 250, 2);

		InventoryManager Armors = new InventoryManager("Armors");
		Armors.addItems(chainMail);
		Armors.addItems(plateMail);

		 

	
		
		System.out.println("Test done");
	
	
	
	
	}

}
