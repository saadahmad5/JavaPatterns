package CreationalPatterns.FactoryPattern.CandyShop;

public class CandyShop {

    public static void main(String[] args){

        CandyFactory.getCandyPackage(CandyTypes.CHOCOLATE_CANDY, 7);
        CandyFactory.getCandyPackage(CandyTypes.CHOCOLATE_CANDY, 12);

        CandyFactory.getCandyPackage(CandyTypes.HARD_CANDY, 20);
        CandyFactory.getCandyPackage(CandyTypes.HARD_CANDY, 5);

    }

}
