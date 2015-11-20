package codingexercises.couponcart;

import java.util.ArrayList;

// Take $N off the next item.
public class CouponTwo extends Coupon {
	private int index;

	CouponTwo(double d, int i){
		super(d);
		index = i;
	}

	public void apply(ArrayList<Item> itemList){
		System.out.println("CouponTwo.apply()");
		for(int i = this.index + 1; i < itemList.size(); i++){
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