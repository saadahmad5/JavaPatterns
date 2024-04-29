package CreationalPatterns.FactoryPattern.CandyStoreComplete;

import java.util.ArrayList;

public class Chocolate_Milk extends Candy {


    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {

        // Implementation

        System.out.println("Milk Chocolates Package has been created having a total of " + quantity + " candies.");

        return null;
    }
}
