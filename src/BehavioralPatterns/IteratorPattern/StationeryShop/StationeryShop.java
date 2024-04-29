package BehavioralPatterns.IteratorPattern.StationeryShop;

public class StationeryShop {

    public static void main(String[] args){

        Item pen = new Item("Pen", 10);
        Item paper = new Item("Paper", 0);
        Item scissors = new Item("Scissors", 5);

        Inventory inventory = new Inventory(pen , paper, scissors);
        InventoryIterator iterator = inventory.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName());
        }

    }

}
