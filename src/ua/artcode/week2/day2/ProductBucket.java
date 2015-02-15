package ua.artcode.week2.day2;

/**
 * Created by serhii on 15.02.15.
 */
public class ProductBucket {

    private Product[] products = new Product[10];
    private int count = 0;

    public ProductBucket() {
    }

    public void addToBucket(Product product){
        products[count] = product;
        count++;
    }

    public double getAmountPrice(){
        double res = 0.0;
        for(int i = 0; i < count; i++){
            res += products[i].getPrice();
        }
        return res;
    }

    public String showAllList(){
        return null;
    }
}
