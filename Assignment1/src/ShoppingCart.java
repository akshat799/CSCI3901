import java.util.*;

public class ShoppingCart {

	public Map<String , List<CartProducts>> carts;
	Size sizeObj;
	public ShoppingCart(){
		this.sizeObj = new Size();
		this.carts = new HashMap<>();
	}

	public int putCartValue(String Name , String Size){
		if(this.sizeObj.sizeValidator(Size)){
			Float newSize = this.sizeObj.getSize(Size);
			String newUnit = this.sizeObj.getUnit(Size);

			CartProducts cartProductsObj = new CartProducts(newSize, newUnit);


			if(!this.carts.isEmpty() && this.carts.containsKey(Name)){
				this.carts.get(Name).add(cartProductsObj);
			}else{
				List<CartProducts> CartList = new ArrayList<>();
				CartList.add(cartProductsObj);
				this.carts.put(Name, CartList);
			}
			System.out.println(carts);
			return 1;
		}else{
			return -1;
		}
	}

}
