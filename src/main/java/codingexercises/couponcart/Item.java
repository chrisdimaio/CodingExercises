package codingexercises.couponcart;

public abstract class Item {
    private ItemType itemType;

    Item(ItemType it){
        itemType = it;
    }

    public ItemType getItemType(){
        return itemType;
    }

    public abstract String toString();
}