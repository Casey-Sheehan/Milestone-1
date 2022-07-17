package app;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author casey
 *
 */
public class ShoppingCart {
	
	
	List<SalableItem> activeCart = new ArrayList<SalableItem>();
	int totalCost;
	
	
	
	/**
	 * 
	 * @param firstItem
	 */
	public ShoppingCart(SalableItem firstItem)
	{
		this.activeCart.add(firstItem);
		this.totalCost = firstItem.getPrice();
	}

	
	/** 
	 * @param item
	 */
	public void RemoveItem(SalableItem item)
	{
		this.activeCart.remove(item);
		System.out.println("Removed " + item + " from cart.");	
	}

	
	/** 
	 * @return int
	 */
	public int CartTotal()
	{	
		int cartTotal = 0;
		for (int i = 0; i < activeCart.size(); ++i)
		{
			cartTotal = cartTotal + activeCart.get(i).itemPrice;
		}
		
		return cartTotal;
	}
	

	
	
	public void checkout()
	{
		int i;
		for (i=this.activeCart.size() - 1;i >= 1;--i)
		{
			this.activeCart.remove(i);
		}
		int cartTotalCost = this.CartTotal();
	}

	public void returnInventory()
	{
		int i;
		System.out.print("The cart contains the following items ");
		for(i=0;i<activeCart.size();++i)
		{
			System.out.print(activeCart.get(i) + ", ");
		}
		System.out.print(".");
	}
	

	
}
