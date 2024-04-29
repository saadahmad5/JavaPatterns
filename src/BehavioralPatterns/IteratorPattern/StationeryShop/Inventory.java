package BehavioralPatterns.IteratorPattern.StationeryShop;

public class Inventory implements Iterable {

    private final Item[] items;

    public Inventory(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }


    @Override
    public InventoryIterator iterator() {
        return new InventoryIterator(this);
    }

}
