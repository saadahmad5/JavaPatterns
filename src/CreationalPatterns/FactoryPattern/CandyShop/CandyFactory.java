package CreationalPatterns.FactoryPattern.CandyShop;

import java.util.ArrayList;

public class CandyFactory {

    public static Candy getCandy(CandyTypes candyTypes) {
        return switch (candyTypes) {
            case HARD_CANDY -> new HardCandy();
            case CHOCOLATE_CANDY -> new ChocolateCandy();
            default -> null;
        };
    }


    public static ArrayList<Candy> getCandyPackage(CandyTypes candyType, int quantity) {
        Candy candy = getCandy(candyType);
        return candy.makeCandyPackage(quantity);
    }


}
