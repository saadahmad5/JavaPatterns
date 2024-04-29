package CreationalPatterns.FactoryPattern.CandyStoreComplete;

public class Main {

    private static final CandyFactory chocolateFactory = new ChocolateCandyFactory();

    public static void main(String[] args){

        chocolateFactory.getCandyPackage(CandyTypes.CHOCOLATE_DARK, 7);
        chocolateFactory.getCandyPackage(CandyTypes.CHOCOLATE_WHITE, 12);
        chocolateFactory.getCandyPackage(CandyTypes.CHOCOLATE_MILK, 5);

        // NPE
        // chocolateFactory.getCandyPackage(CandyTypes.HARD_CANDYCANE, 10);

    }

}
