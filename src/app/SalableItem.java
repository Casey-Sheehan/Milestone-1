package app;
import app.InventoryManager;
import app.StoreFront;
import app.ShoppingCart;


/**
 * 
 * @author casey
 *
 */
public class SalableItem {
	
	
	public String itemName;
	public String itemDescription;
	public float itemPrice;
	public int itemQuantity;
	public String itemDept;
	
	/**
	 * Constructor
	 * @param newItemName
	 * @param newItemDescription
	 * @param newItemPrice
	 * @param newItemQuantity
	 * @param newItemDept
	 */
	public SalableItem(String newItemName, String newItemDescription, float newItemPrice, int newItemQuantity, String newItemDept)
	{
		this.itemName = newItemName;
		this.itemDescription = newItemDescription;
		this.itemPrice = newItemPrice;
		this.itemQuantity = newItemQuantity;
		this.itemDept = newItemDept;
		
	}
	

	/**
	 *  series of tests and console prints to ensure initial functionality
	 */
	public void salableItemTest()
	{
		System.out.println("Begin SalableItem Test:");
		System.out.println("getName returns: " + this.getName());
		this.setName("Snips");
		System.out.println("setName performed, itemName is now: " + this.getName());
		System.out.println("getPrice returns: " + this.getPrice());
		this.setPrice((float) 6.99);
		System.out.println("setPrice performed, price is now: " + this.getPrice());
		System.out.println("The Description for " + this.getName() + " is: " + this.getDescription());
		this.setDescription("Great for Snipping!");
		System.out.println("setDescription performed, itemDesc is now: " + this.getDescription());
		System.out.println(this.getName() + " quantity is: " + this.getQuantity());
		this.setQuantity(9);
		System.out.println("setQuantity perfomed, the quantity is now: " + this.getQuantity());
		System.out.println("Test Complete, Great work!");
	}
	
	
	/**
	 * 
	 * @return float itemPrice
	 */
	public float getPrice()
	{
		return itemPrice;
	}
	
	/**
	 * 
	 * @param newPrice will replace itemPrice
	 */
	public void setPrice(float newPrice)
	{
		itemPrice = newPrice;
	}
	
	/**
	 * 
	 * @return itemName string
	 */
	public String getName()
	{
		return itemName;
	}
	
	/**
	 * 
	 * @param newName replaces itemName
	 */
	public void setName(String newName)
	{
		itemName = newName;
	}
	
	/**
	 * 
	 * @return string itemDescription
	 */
	public String getDescription()
	{
		return itemDescription;
	}
	
	/**
	 * 
	 * @param newDescription replaces itemDescription
	 */
	public void setDescription(String newDescription)
	{
		itemDescription = newDescription;
	}

	/**
	 * 
	 * @return int itemQuantity
	 */
	public int getQuantity()
	{
		return itemQuantity;
	}
	
	/**
	 * 
	 * @param newQuantity replaces itemQuantity
	 */
	public void setQuantity(int newQuantity)
	{
		itemQuantity = newQuantity;
	}









}
