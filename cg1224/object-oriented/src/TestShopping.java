import com.zubair.shop.Product;
import com.zubair.shop.ShoppingCart;
import com.zubair.shop.ShoppingCartException;

public class TestShopping {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		try {
			cart.addItem(new Product("Natraj Pencil", 3));
			cart.addItem(new Product("Raynolds 0.5", 5));
			cart.addItem(new Product("Doms Sketchpen", 15));
			cart.addItem(new Product("Apsara Eraser", 2));
			cart.addItem(new Product("Cello Gripper", 5));
		} catch (ShoppingCartException e) {
			System.out.println(e.getMessage());
		}
		
		cart.checkout();
		
		try {
			cart.addItem(new Product("Whatever", 30));
		} catch (ShoppingCartException e) {
			System.out.println(e.getMessage());
		}
	}
}
