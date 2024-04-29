package StructuralPatterns.DecoratorPattern.Pizza;

public class Main {

    public static void main(String[] args) {

        System.out.println("Plain Pizza");

        FoodItem plainPizza = new Pizza();
        plainPizza.showIngredients();

        System.out.println();
        System.out.println("Margarita Pizza");

        FoodItem margaritaPizza = new Pizza();
        margaritaPizza = new MargaritaPizza(margaritaPizza);
        margaritaPizza.showIngredients();

        System.out.println();
        System.out.println("Margarita Pizza with Chicken");

        FoodItem margaritaPizzaWithChicken = new Pizza();
        margaritaPizzaWithChicken = new MargaritaPizza(margaritaPizzaWithChicken);
        margaritaPizzaWithChicken = new ChickenPizza(margaritaPizzaWithChicken);
        margaritaPizzaWithChicken.showIngredients();

    }

}
