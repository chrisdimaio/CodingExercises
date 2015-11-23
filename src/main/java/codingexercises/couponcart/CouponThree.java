package codingexercises.couponcart;

import java.util.ArrayList;

// Take X% off the Nth item of type T.
public class CouponThree extends Coupon {
    private int nth;
    private String productName;

    CouponThree(String pN, double d, int n){
        super(d);
        productName = pN;
        nth         = n;
    }

    public void apply(ArrayList<Item> itemList){
        System.out.println("getIndex: " + getIndex(itemList));
        System.out.println("index: " + index);

        int rightProductCount = 0;
        for(int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            if(item.getItemType() == ItemType.PRODUCT){
                Product product = (Product)item;
                if(product.getProductName() == productName){
                    if(++rightProductCount == nth) {
                        product.setPrice((1.0 - this.getDiscount()) * product.getPrice());
                        break;
                    }
                }
            }
        }
    }

    public String toString(){
        return super.toString() + ": Take " + (this.getDiscount() * 100) + "% off all " + nth 
            + placeSuffix(nth) + " item of type '" + productName + "'.";
    }

    private String placeSuffix(int place){
        String suffix;
        if((place - 1) % 10 == 0){
            suffix = "st";
        } else if((place - 2) % 10 == 0){
            suffix = "nd";
        } else if((place - 3) % 10 == 0){
            suffix = "rd";
        } else {
            suffix = "th";
        }
        return suffix;
    }
}

