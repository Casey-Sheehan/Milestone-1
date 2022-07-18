package app;


import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;





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

	
	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Audto-generated method stub
		Scanner input = new Scanner(System.in);
		int userChoice;
		StoreFront Shop = new StoreFront("Test Shop");
		int i;
		int userWallet = 1000;

		Weapon PlaceHolder = new Weapon("Place Holder", "Empty Place Holder", 0, 1);
		ShoppingCart Cart = new ShoppingCart(PlaceHolder);
		 
		Weapon longSword = new Weapon("Long Sword", "A nice shiny Long Sword!",  50, 2);
		Weapon maceItem = new Weapon("Mace", "A heavy spiky mace!", 25, 5);
		
		InventoryManager Weapons = new InventoryManager("Weapons");
		Weapons.addItems(longSword);
		Weapons.addItems(maceItem);
		

		Armor chainMail = new Armor("Chain Mail", "Made of Mithril", 150, 1);
		Armor plateMail = new Armor("Plate Mail", "Plated Mail!", 250, 2);

		InventoryManager Armors = new InventoryManager("Armors");
		Armors.addItems(chainMail);
		Armors.addItems(plateMail);

		System.out.println("this item is a: " + longSword.toString());
		System.out.println("this list contains: " + Weapons.departmentItems);
		System.out.println("this armor is a: " + chainMail.toString());
		System.out.println("this list contains: " + Armors.departmentItems);
		System.out.println("This longsword has a description of: " + longSword.itemDescription);
		int lastChoice = 0;

		System.out.println("getItemPrice(index) test: " + Armors.departmentItems.get(0).itemPrice);

		// Beginning of Shop Interface
	do{
		System.out.println("=======");
		System.out.println("Welcome to " + Shop.shopName);
		System.out.println("Menu");
		System.out.println("=======");
		System.out.println("1. List Armors");
		System.out.println("2. List Weapons");
		System.out.println("3. Cart Total");
		System.out.println("4. Checkout");
		System.out.println("5. List Inventory");
		System.out.println("6. Sort Shop Inventory");
		System.out.println("7. Exit");
		System.out.print("Please Select an Option Listed Above: ");
		userChoice = input.nextInt();
		
		switch (userChoice)
		{
			case 1:
				for (i = 0; i < Armors.departmentItems.size(); ++i)
					{
						System.out.println("Item " + (i + 1) + ": " + Armors.departmentItems.get(i).toString());
					}
					System.out.print("Choose an item from the above list: ");
					userChoice = input.nextInt();
					lastChoice = userChoice;
					

					switch (userChoice)
					{
						case 1:
							System.out.println("You have selected: " + Armors.departmentItems.get(userChoice - 1).toString());
							System.out.print("Select 1 to add to cart or 2 to return to Main Menu: ");
							userChoice = input.nextInt();
							if (userChoice == 1)
								{
									Cart.activeCart.add(Armors.departmentItems.get(lastChoice - 1));
									Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
									System.out.println(Cart.activeCart.get(Cart.activeCart.size() - 1).toString() + " has been added to the cart.");
									continue;
								}
							else 
							{
								continue;
							}
						
						case 2:
							System.out.println("You have selected: " + Armors.departmentItems.get(lastChoice - 1).toString());
							System.out.print("Select 1 to add to cart or 2 to return to Main Menu: ");
							userChoice = input.nextInt();
								if (userChoice == 1)
								{
									Cart.activeCart.add(Armors.departmentItems.get(lastChoice - 1));
									Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
									System.out.println(Cart.activeCart.get(Cart.activeCart.size() - 1).toString() + " has been added to the cart.");
									continue;
								}
								
								else
								{
									continue;
								}
						case 0:
								continue;
								
						}
						break;
		
				
	
			


			case 2:
				for (i=0;i<Weapons.departmentItems.size();++i)
				{
					System.out.println("Item " + (i + 1) + ": " + Weapons.departmentItems.get(i).toString());
				}
				System.out.print("Choose an option from the list above: ");
				
				userChoice = input.nextInt();
				lastChoice = userChoice;

				switch (userChoice) 
				{
					case 1: 
					System.out.println("You have selected: " + Weapons.departmentItems.get(lastChoice - 1).toString());
					System.out.print("Select 1 to add to cart or 2 to return to Main Menu: ");
					userChoice = input.nextInt();
					if (userChoice == 1)
						{
							Cart.activeCart.add(Weapons.departmentItems.get(lastChoice - 1));
							Weapons.removeItems(Weapons.departmentItems.get(lastChoice - 1));
							System.out.println(Cart.activeCart.get(Cart.activeCart.size() - 1).toString() + " has been added to the cart.");
							continue;
						}
					else 
					{
						continue;
					}
				
					case 2:
					System.out.println("You have selected: " + Weapons.departmentItems.get(userChoice - 1).toString());
					System.out.print("Select 1 to add to cart or 2 to return to Main Menu: ");
					userChoice = input.nextInt();
						if (userChoice == 1)
						{
							Cart.activeCart.add(Weapons.departmentItems.get(userChoice - 1));
							Weapons.removeItems(Weapons.departmentItems.get(userChoice - 1));
							System.out.println(Cart.activeCart.get(Cart.activeCart.size() - 1).toString() + " has been added to the cart.");
							continue;
						}
						else
						{
							continue;
						}
				}
			

				case 3:
						System.out.println("Total of items and cost of active cart is: " + Cart.CartTotal());
						continue;
					
				case 4:
					System.out.println("Total cost: " + Cart.CartTotal());
					Cart.checkout();
					System.out.println("Total cost: " + Cart.CartTotal());
					System.out.println("Checkout Successful");
					continue;
				
				case 5: 
						Cart.returnInventory();
						continue;

				case 6:
					for (i = 0; i < Armors.departmentItems.size(); ++i)
						{
							System.out.print("Unsorted items: "+ Armors.departmentItems.get(i).itemName);
						}
					System.out.println(" ");
					for (i = 0; i < Weapons.departmentItems.size(); ++i)
						{
							System.out.print("Unsorted items: " + Weapons.departmentItems.get(i).itemName);
						}
					System.out.println(" ");

					Armors.sortItems();
					Weapons.sortItems();

				case 7:
						break;


						
				case 0:
						continue;
						
				}
				continue;
				
			
		
	}while (Cart.activeCart.size() != 0);


/* 
		// First Query
		System.out.print("Please select an option listed above: ");
		userChoice = input.nextInt();

			// Chooses armors
			if (userChoice == 1)
			{	
				//	Cycles Armors and supplys an integer choice
				for (i = 0; i < Armors.departmentItems.size(); ++i )
				{
					String item = Armors.departmentItems.get(i).toString();
					System.out.println("Item " + (i + 1) + " is: " + item);
				}
				// Second Query
				System.out.print("Please choose an item for choices: ");
				userChoice = input.nextInt();
				// Armor 1
				if (userChoice == 1)
				{
					System.out.println("You have selected " + Armors.departmentItems.get(userChoice - 1).toString());
					System.out.println("Would you like to purchase this item or return to the Original menu?");
				
					// Do while choice != 0
					do	{
						// lastChoice is stored for purchase/price checking later
						System.out.print("Type 1 to add to cart or 2 to cancel: ");
						int lastChoice = userChoice;
						userChoice = input.nextInt();
					
						// Has enough funds
						if (userChoice == 1 && userWallet >= Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{
							System.out.println("Item Cost: " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println(Armors.departmentItems.get(lastChoice - 1) + " Sold to user!");
							Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
							return;
						}

						// Insufficient Funds
						if (userChoice == 1 && userWallet < Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{

							System.out.println("Item Cost: " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println("Insufficient Funds");
							continue;
						}

						//Returns to previous menu (hopefully)
						if (userChoice == 2)
						{
							return;
						}

						// Cycles back if improper response
						else
						{
							System.out.println("Improper Response");
							continue;
						}
					} while (userChoice != 0);
				}

				if (userChoice == 2)
				{
					System.out.println("You have selected " + Armors.departmentItems.get(userChoice - 1).toString());
					System.out.println("Would you like to purchase this item or return to the Original menu?");
				
					// Do while choice != 0
					do	{
						// lastChoice is stored for purchase/price checking later
						System.out.print("Type 1 to add to cart or 2 to cancel: ");
						int lastChoice = userChoice;
						userChoice = input.nextInt();
					
						// Has enough funds
						if (userChoice == 1 && userWallet >= Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{
							System.out.println("Item Cost: " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println(Armors.departmentItems.get(lastChoice - 1) + " Sold to user!");
							Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
							return;
						}

						// Insufficient Funds
						if (userChoice == 1 && userWallet < Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{

							System.out.println("Item Cost: " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println("Insufficient Funds");
							continue;
						}

						//Returns to previous menu (hopefully)
						if (userChoice == 2)
						{
							return;
						}

						// Cycles back if improper response
						else
						{
							System.out.println("Improper Response");
							continue;
						}
					} while (userChoice != 0);
				}
				else 
				{
					return;
				}
			}
	


		
			// Weapons Choice
			if (userChoice == 2)
			{
				//	Cycles Weapons and supplys an integer choice
				for (i = 0; i < Weapons.departmentItems.size(); ++i )
			{
				String item = Weapons.departmentItems.get(i).toString();
				System.out.println("Item " + (i + 1) + " is: " + item);
			}
			// Second Query
			System.out.print("Please choose an item for choices: ");
			userChoice = input.nextInt();
			// Armor 1
			if (userChoice == 1)
			{
				System.out.println("You have selected " + Weapons.departmentItems.get(userChoice - 1).toString());
				System.out.println("Would you like to purchase this item or return to the Original menu?");
		
			// Do while choice != 0
			do	
			{
				// Sell or return
				// lastChoice is stored for purchase/price checking later
				System.out.print("Type 1 to add to cart or 2 to cancel: ");
				int lastChoice = userChoice;
				userChoice = input.nextInt();
			
				// Has enough funds
				if (userChoice == 1 && userWallet >= Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println("Item Cost: " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println(Weapons.departmentItems.get(lastChoice - 1) + " added to users Cart!");
					Cart.activeCart.add(Weapons.departmentItems.get(lastChoice - 1));
					Weapons.removeItems(Weapons.departmentItems.get(lastChoice - 1));
					continue;
				}

				// Insufficient Funds
				if (userChoice == 1 && userWallet < Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println("Item Cost: " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println("Insufficient Funds");
					continue;
				}

				//Returns to previous menu (hopefully)
				if (userChoice == 2)
				{
					continue;
				}

				// Cycles back if improper response
				else
				{
					System.out.println("Improper Response");
					continue;
				}
			} while (userChoice != 0);
		}


		// Weapons list index 1, userchoice 2
		if (userChoice == 2)
			{
				System.out.println("You have selected " + Weapons.departmentItems.get(userChoice - 1).toString());
				System.out.println("Would you like to purchase this item or return to the Original menu?");
		
			// Do while choice != 0
			do	
			{
				// Sell or return
				// lastChoice is stored for purchase/price checking later
				System.out.print("Type 1 to add to cart or 2 to cancel: ");
				final int lastChoice = userChoice;
				userChoice = input.nextInt();
			
				// Has enough funds
				if (userChoice == 1 && userWallet >= Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println("Item Cost: " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println(Weapons.departmentItems.get(lastChoice - 1) + " Sold to user!");
					Weapons.removeItems(Weapons.departmentItems.get(lastChoice - 1));
					return;
				}

				// Insufficient Funds
				if (userChoice == 1 && userWallet < Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println("Item Cost: " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println("Insufficient Funds");
					continue;
				}

				//Returns to previous menu (hopefully)
				if (userChoice == 2)
				{
					return;
				}

				// Cycles back if improper response
				else
				{
					System.out.println("Improper Response");
					continue;
				}
			} while (userChoice != 0);
		}
		
		if (userChoice == 3)
		{
			System.out.println("Ending program, Goodbye!");
			return;
		}
		System.out.println("Test done");
		}
		else
		{
			return;
		}
	
} while (Cart.activeCart.size() != 0); 
*/

}
}
	

	
