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
	float totalCost;
	
	
	
	/**
	 * 
	 * @param firstItem
	 */
	public ShoppingCart(SalableItem firstItem)
	{
		this.activeCart.add(firstItem);
		this.totalCost = firstItem.getPrice();
	}

	public void RemoveItem(SalableItem item)
	{
		this.activeCart.remove(item);
		System.out.println("Removed " + item + " from cart.");	
	}

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
		int cartTotalCost = this.CartTotal();
		for (i=1;i< this.activeCart.size();++i)
		{
			this.activeCart.remove(i);
		}
	}
	

	
}
