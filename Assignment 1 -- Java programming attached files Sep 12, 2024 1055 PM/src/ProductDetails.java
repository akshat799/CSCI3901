import java.util.Date;

public class ProductDetails {
    public Date date;
    public Float size;
    public Float cost;
    public String unit;
    public ProductDetails(Float size , String unit, Float cost , Date date){
        this.date = date;
        this.size = size;
        this.unit = unit;
        this.cost = cost;
    }
}
