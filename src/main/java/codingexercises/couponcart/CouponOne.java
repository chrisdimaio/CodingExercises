package codingexercises.couponcart;

import java.util.ArrayList;

// Take X% off all items.
public class CouponOne extends Coupon {
    CouponOne(double d){
        super(d);
    }

    public void apply(ArrayList<Item> itemList){
        System.out.println("CouponOne.apply()");
        for(Item item: itemList){
            if(item.getItemType() == ItemType.PRODUCT){
                Product product = (Product)item;
                product.setPrice((1.0 - this.getDiscount()) * product.getPrice());
            }
        }
    }

    public String toString(){
        return super.toString() + ": Take " + (this.getDiscount() * 100) + "% off all items.";
    }
}
