package codingexercises.couponcart;

public class Product extends Item {
    private double price;
    private String productName;

    Product(String pN, double p){
        super(ItemType.PRODUCT);
        productName = pN;
        price       = p;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public String toString(){
        return "$" + price + " " + productName;
    }
}