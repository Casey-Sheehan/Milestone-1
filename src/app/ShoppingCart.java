package app;
import app.StoreFront;
import app.SalableItem;
import app.InventoryManager;
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
	

	
}
