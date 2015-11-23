package codingexercises.couponcart;

import java.util.ArrayList;

// Take $N off the next item.
public class CouponTwo extends Coupon {
    private int index;

    CouponTwo(double d){
        super(d);
    }

    public void apply(ArrayList<Item> itemList){
        for(int i = this.getIndex(itemList) + 1; i < itemList.size(); i++){
            Item item = itemList.get(i);
            if(item.getItemType() == ItemType.PRODUCT){
                Product product = (Product)item;
                product.setPrice(product.getPrice() - this.getDiscount());
                break;
            }
        }
    }

    public String toString(){
        return super.toString() + ": Take $" + this.getDiscount() + " off next item.";
    }
}