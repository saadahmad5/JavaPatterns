package StructuralPatterns.DecoratorPattern.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements FoodItem {

    List<String> ingredients;
    List<Double> price;

    public Pizza() {
        ingredients = new ArrayList<>();
        ingredients.add("Dough");
        ingredients.add("Cheese");
        price = new ArrayList<>();
        price.add(10.0);
    }

    @Override
    public void showIngredients() {
        ingredients.forEach(System.out::println);
        System.out.println("Price: " + price.stream().reduce(0.0, (subtotal, p) -> subtotal + p));
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public List<Double> getPrice() {
        return price;
    }
}
