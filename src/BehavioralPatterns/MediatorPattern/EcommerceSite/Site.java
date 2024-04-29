package BehavioralPatterns.MediatorPattern.EcommerceSite;

import java.util.HashMap;
import java.util.Map;

public class Site {

    Map<String, Integer> stock;

    public Site() {
        stock = new HashMap<>();
        stock.put("pen", 10);
        stock.put("pencil", 5);
        stock.put("marker", 20);
        stock.put("eraser", 0);
    }

    private boolean isInStock(String item, int quantity) {
        return stock.containsKey(item) && stock.get(item) >= quantity;
    }

    public boolean purchase(String item, int quantity) {
        if (isInStock(item, quantity)) {
            int currentQuantity = stock.get(item);
            stock.put(item, currentQuantity - quantity);
            return true;
        } else {
            return false;
        }
    }

    public void showStockStatus() {
        System.out.println("Stock details:");
        stock.forEach((item, quantity) -> {
            System.out.println(item + " = " + quantity);
        });
    }

}
