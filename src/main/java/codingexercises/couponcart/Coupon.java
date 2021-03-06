package codingexercises.couponcart;

import java.util.ArrayList;

public abstract class Coupon extends Item {
    private double discount;

    Coupon(double d){
        super(ItemType.COUPON);
        discount = d;
    }

    protected double getDiscount(){
        return discount;
    }

    protected int getIndex(ArrayList<Item> itemList){
        return itemList.indexOf(this);
    }

    public String toString(){
        return "Coupon";
    }

    public abstract void apply(ArrayList<Item> itemList);
}