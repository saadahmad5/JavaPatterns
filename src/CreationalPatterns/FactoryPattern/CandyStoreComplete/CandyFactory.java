package CreationalPatterns.FactoryPattern.CandyStoreComplete;

import java.util.ArrayList;

public abstract class CandyFactory {

    public abstract Candy getType(CandyTypes candyType);

    public ArrayList<Candy> getCandyPackage(CandyTypes candyType, int quantity) {

        // Implementation

        System.out.println("Candy Packaging");

        Candy candy = getType(candyType);
        candy.makeCandyPackage(quantity);

        return null;
    }

}
