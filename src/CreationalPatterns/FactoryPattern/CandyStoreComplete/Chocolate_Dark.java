package CreationalPatterns.FactoryPattern.CandyStoreComplete;

import java.util.ArrayList;

public class Chocolate_Dark extends Candy {


    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {

        // Implementation

        System.out.println("Dark Chocolates Package has been created having a total of " + quantity + " candies.");

        return null;
    }
}
