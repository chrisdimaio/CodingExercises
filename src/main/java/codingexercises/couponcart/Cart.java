package codingexercises.couponcart;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public boolean add(Item item){
        return itemList.add(item);
    }

    public double calculateTotal(){

        for(Item item: itemList){
            if(item.getItemType() == ItemType.COUPON){
                Coupon coup = (Coupon)item;
                coup.apply(itemList);
            }
        }
        double totalPrice = 0.0;
        for(Item item: itemList){
            if(item.getItemType() == ItemType.PRODUCT){
                Product product = (Product)item;
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public String toString(){
        String string = "";
        for(int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            string += i + ": " + item.toString() + "\n";
        }
        string += "---------------------------------\n";
        string += "Total: $" + calculateTotal();
        return string;
    }

    public void printCart(){
        for(Item item: itemList){
            if(item.getItemType() == ItemType.PRODUCT){
                Product product = (Product)item;
                System.out.println(product.getPrice());
            }
        }
    }

    public int size(){
        return itemList.size();
    }
}
