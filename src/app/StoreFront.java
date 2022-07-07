package app;


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


		System.out.println("getItemPrice(index) test: " + Armors.departmentItems.get(0).itemPrice);

		// Beginning of Shop Interface
		System.out.println("=======");
		System.out.println("Welcome to " + Shop.shopName);
		System.out.println("Menu");
		System.out.println("=======");
		System.out.println("1. List Armors");
		System.out.println("2. List Weapons");
		System.out.println("3. Exit");

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
						System.out.print("type 1 to buy or 2 to cancel: ");
						int lastChoice = userChoice;
						userChoice = input.nextInt();
					
						// Has enough funds
						if (userChoice == 1 && userWallet >= Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{
							System.out.println(" test " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println(Armors.departmentItems.get(lastChoice - 1) + " Sold to user!");
							Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
							return;
						}

						// Insufficient Funds
						if (userChoice == 1 && userWallet < Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{

							System.out.println(" test " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
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
						System.out.print("type 1 to buy or 2 to cancel: ");
						int lastChoice = userChoice;
						userChoice = input.nextInt();
					
						// Has enough funds
						if (userChoice == 1 && userWallet >= Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{
							System.out.println(" test " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
							System.out.println(Armors.departmentItems.get(lastChoice - 1) + " Sold to user!");
							Armors.removeItems(Armors.departmentItems.get(lastChoice - 1));
							return;
						}

						// Insufficient Funds
						if (userChoice == 1 && userWallet < Armors.departmentItems.get(lastChoice - 1).itemPrice)
						{

							System.out.println(" test " + Armors.departmentItems.get(lastChoice - 1).itemPrice);
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
				System.out.print("type 1 to buy or 2 to cancel: ");
				int lastChoice = userChoice;
				userChoice = input.nextInt();
			
				// Has enough funds
				if (userChoice == 1 && userWallet >= Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println(" test " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println(Weapons.departmentItems.get(lastChoice - 1) + " Sold to user!");
					Weapons.removeItems(Weapons.departmentItems.get(lastChoice - 1));
					return;
				}

				// Insufficient Funds
				if (userChoice == 1 && userWallet < Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println(" test " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
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
				System.out.print("type 1 to buy or 2 to cancel: ");
				final int lastChoice = userChoice;
				userChoice = input.nextInt();
			
				// Has enough funds
				if (userChoice == 1 && userWallet >= Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println(" test " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
					System.out.println(Weapons.departmentItems.get(lastChoice - 1) + " Sold to user!");
					Weapons.removeItems(Weapons.departmentItems.get(lastChoice - 1));
					return;
				}

				// Insufficient Funds
				if (userChoice == 1 && userWallet < Weapons.departmentItems.get(lastChoice - 1).itemPrice)
				{
					System.out.println(" test " + Weapons.departmentItems.get(lastChoice - 1).itemPrice);
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
	}
}
	

	
