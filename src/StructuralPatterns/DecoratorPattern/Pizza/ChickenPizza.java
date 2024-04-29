package StructuralPatterns.DecoratorPattern.Pizza;

import java.util.List;

public class ChickenPizza implements FoodItem {

    FoodItem pizza;

    ChickenPizza(FoodItem pizza) {
        this.pizza = pizza;
        this.pizza.getIngredients().add("Chicken");
        this.pizza.getPrice().add(5.0);
    }

    @Override
    public void showIngredients() {
        pizza.showIngredients();
    }

    @Override
    public List<String> getIngredients() {
        return pizza.getIngredients();
    }

    @Override
    public List<Double> getPrice() {
        return this.pizza.getPrice();
    }
}
