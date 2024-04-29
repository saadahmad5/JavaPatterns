package CreationalPatterns.FactoryPattern.CandyShop;

import java.util.ArrayList;

public class ChocolateCandy extends Candy {


    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {

        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for(int i = 0; i < quantity; ++i) {
            ChocolateCandy chocolateCandy = new ChocolateCandy();
            chocolatePackage.add(chocolateCandy);
        }

        System.out.printf("Chocolate Package has been created having a total of %d candies.\n", quantity);
        return chocolatePackage;
    }
}
