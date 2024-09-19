import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CostOfLiving {
    public Product productObj;
    public Map<Integer , ShoppingCart> cartList;
    int counter;
    int cartCounter;
    public CostOfLiving() {
        this.productObj = new Product();
        this.counter = 0;
        this.cartList = new HashMap<>();
        this.cartCounter = 0;
    }

    public int loadProductHistory( BufferedReader productStream ) {
        String line;
        try{
            while((line = productStream.readLine()) != null){
                String[] values = line.split("\t");

                if(values.length != 4){
                    return -1;
                }

                int checker = this.productObj.putValue(values[0],values[1], values[2], values[3]);

                if(checker == -1){
                    return -1;
                }
                this.counter = checker;

            }
            return this.counter;
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public int loadShoppingCart( BufferedReader cartStream ) {
        String line;
        ShoppingCart CartObj = new ShoppingCart();
        try{
            while((line = cartStream.readLine()) != null){
                String[] values = line.split("\t");

                if(values.length != 2){
                    return -1;
                }

                int checker = CartObj.putCartValue(values[0], values[1]);

                if(checker == -1){
                    return -1;
                }
            }
            this.cartCounter++;

            this.cartList.put(this.cartCounter , CartObj);
            System.out.println(this.cartList);
            return this.cartCounter;
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    public float shoppingCartCost( int cartNumber, int year, int month ) {
        return -1.0f;
    }

    public Map<String, Float> inflation( int startYear, int startMonth, int endYear, int endMonth ) {
        return null;
    }

    public List<String> priceInversion( int year, int month, int tolerance ) {
        return null;
    }
}
