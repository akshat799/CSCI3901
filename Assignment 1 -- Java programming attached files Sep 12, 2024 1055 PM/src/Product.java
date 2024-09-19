import java.util.*;

public class Product {
    public Map<String , List<ProductDetails>> products;

    Price priceObj;
    Time dateObj;
    Size sizeObj;

    public Product(){
       this.products =  new HashMap<>();
       this.priceObj = new Price();
       this.dateObj = new Time();
       this.sizeObj = new Size();
    }

    public int putValue(String Date , String Name , String Size , String Cost){

        if(this.priceObj.costValidator(Cost) && this.dateObj.dateValidator(Date) && this.sizeObj.sizeValidator(Size)){
            Float newSize = this.sizeObj.getSize(Size);
            String newUnit = this.sizeObj.getUnit(Size);
            Float newCost = this.priceObj.getCost(Cost);
            Date newDate = this.dateObj.getDate(Date);
            ProductDetails productDetailsObj =  new ProductDetails(newSize,newUnit,newCost,newDate);

            if(!this.products.isEmpty() && this.products.containsKey(Name)){
                this.products.get(Name).add(productDetailsObj);
                this.sorter(this.products.get(Name));
            }else{
                List<ProductDetails> productList = new ArrayList<>();
                productList.add(productDetailsObj);
                this.products.put(Name, productList);
            }
            return noEntries();
        }else{
            this.products.clear();
            return -1;
        }
    }

    public void sorter(List<ProductDetails> productList){
        productList.sort(Comparator.comparing(x -> x.date));
    }

    public int noEntries(){
        int count = 0;
        for(Map.Entry<String, List<ProductDetails>> i : products.entrySet()){
            count += i.getValue().size();
        }
        return count;
    }

}
