package StructuralPatterns.DecoratorPattern.Pizza;

import java.util.List;

public interface FoodItem {

    public void showIngredients();

    public List<String> getIngredients();

    public List<Double> getPrice();

}
