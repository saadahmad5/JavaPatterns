package CreationalPatterns.FactoryPattern.CandyShop;

import java.util.ArrayList;

public class HardCandy extends Candy {


    @Override
    public ArrayList<Candy> makeCandyPackage(int quantity) {

        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        if (quantity % 10 != 0) {
            System.out.println("Hard Candy is only packaged in multiples of ten.");
        } else {
            for(int i = 0; i < quantity; ++i) {
                Candy hardCandy = new HardCandy();
                hardCandyPackage.add(hardCandy);
            }
            System.out.printf("Hard Candy Package has been created having a total of %d candies.\n", quantity);
        }
        return hardCandyPackage;
    }
}
