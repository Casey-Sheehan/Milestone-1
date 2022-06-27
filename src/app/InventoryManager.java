package app;
import app.ShoppingCart;
import app.SalableItem;
import app.StoreFront;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author casey
 *
 */
public class InventoryManager {

	String departmentName;
	List<SalableItem> departmentItems = new ArrayList<SalableItem>();
	int totalItems = departmentItems.size();
	
	public InventoryManager(String newDeptName)
	{
		this.departmentName = newDeptName;
	}
	
	/**
	 * First set of tests for initial functionality
	 */
	public void InventoryManagerTest1()
	{
		System.out.println("Begin InventoryManagerTest1:");
		System.out.println("getDeptName returns: " + this.getDeptName());
		this.setDeptName("Arts and Crafts");
		System.out.println("setDeptName performed, departmentName is now: " + this.getDeptName());
		System.out.print("List contains: ");
		this.getDeptItems();
		System.out.println("Array size: " + this.departmentItems.size());
		System.out.println("Invtest1 done");
	}
	
	/**
	 * Second set of tests for initial functionality
	 */
	public void InventoryManagerTest2()
	{
		System.out.println("Begin InventoryManagerTest2:");
		System.out.println("setDeptName performed, departmentName is now: " + this.getDeptName());
		System.out.println("Array size: " + this.departmentItems.size());	
		System.out.println("Invtest2 done");
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
		departmentName = newName;
	}
	
	/**
	 * Needs work, not publishing correct names
	 */
	public void getDeptItems()
	{
		System.out.println(departmentItems);
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
	 * Returns the total size of the List
	 * @return
	 */
	public int getTotalItems()
	{
		int totalInDept = departmentItems.size();
		return totalInDept;
	}
	
	
	
	/**
	 * find way to store all items in the department into a list
	 * arrays do not seem well suited to this
	public String[] removeItems(String byeItem)
	{
		
		String[] tempArr = new String[departmentItems.length - 1];
		int foundItemLocation;
		for (int i = 0; i < departmentItems.length; ++i)
		{
			if (departmentItems[i] == byeItem)
			{
				foundItemLocation = i;
				continue;
			}
			else 
			{
				tempArr[i] = departmentItems[i];
			
			}
	*/
	
	
	
}
