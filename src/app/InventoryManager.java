package app;
import app.ShoppingCart;
import app.SalableItem;
import app.StoreFront;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * 
 * @author casey
 *
 */
public class InventoryManager {

	String departmentName;
	List<SalableItem> departmentItems = new ArrayList<SalableItem>();
	List<String> departmentItemsStrings = new ArrayList<String>();
	int totalItems = departmentItems.size();
	
	protected InventoryManager(String newDeptName)
	{
		this.departmentName = newDeptName;
	}
	

	
	/**
	 * 
	 * @return returns the dept name as a string
	 */
	public String getDeptName()
	{
		return departmentName;
	}
	
	/**
	 * takes new string and replaces deparmentName with new String
	 * @param newName
	 */
	public void setDeptName(String newName)
	{
		this.departmentName = newName;
	}
	
	/**
	 * Needs work, not publishing correct names
	 */
	public void getDeptItems()
	{
		System.out.println(departmentItemsStrings);
	}
	
	/**
	 * 
	 * @param byeItem removes all instances of byeItem from departmentItems
	 */
	public void removeItems(SalableItem byeItem)
	{
		departmentItems.remove(byeItem);
	}
	
	/**
	 * Adds the new SalableItem object to the List
	 * @param newItem
	 */
	public void addItems(SalableItem newItem)
	{
		departmentItems.add(newItem);
	}

	/**
	 * Sorts our inventory managers into alphabetical order
	 */
	public void sortItems()
	{
		// ascending sort
		// credit to Greg Anderson on youtube, his video helped a ton
		//
		Collections.sort(departmentItems, new Comparator<SalableItem>()
		{
			public int compare(SalableItem i1, SalableItem i2)
			{
				return String.valueOf(i1.itemName).compareTo(i2.itemName);
			}
		});
		for (int i=0;i<departmentItems.size();++i)
		{
		System.out.println("Item name: " + departmentItems.get(i).itemName);
		}
	}
	
	/**
	 * Returns the total size of the List
	 * @return int 
	 */
	public int getTotalItems()
	{
		return departmentItems.size();
	}
	
	
	/** 
	 * @param i
	 * @return int
	 */
	public int getItemPrice(int i)
	{
		return this.departmentItems.get(i).itemPrice;		
	}
	
	

	
	
	
}
