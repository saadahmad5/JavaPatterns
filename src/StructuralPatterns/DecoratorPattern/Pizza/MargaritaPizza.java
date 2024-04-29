package StructuralPatterns.DecoratorPattern.Pizza;

import java.util.List;

public class MargaritaPizza implements FoodItem {

    FoodItem pizza;

    MargaritaPizza(FoodItem pizza) {
        this.pizza = pizza;
        this.pizza.getIngredients().add("Margarita sauce");
        this.pizza.getIngredients().add("Basil Leaves");
        this.pizza.getPrice().add(3.0);
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
        return pizza.getPrice();
    }
}
