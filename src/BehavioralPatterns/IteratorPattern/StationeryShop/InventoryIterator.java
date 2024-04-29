package BehavioralPatterns.IteratorPattern.StationeryShop;

import java.util.Iterator;

public class InventoryIterator implements Iterator {

    private final Inventory inventory;
    private int index;

    public InventoryIterator(Inventory inventory) {
        this.inventory = inventory;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < inventory.getItems().length;
    }

    @Override
    public Item next() {
        if (hasNext()) {
            Item item = inventory.getItems()[index++];
            if (item.getQuantity() > 0) {
                return item;
            } else {
                return next();
            }
        } else {
            return null;
        }
    }
}
