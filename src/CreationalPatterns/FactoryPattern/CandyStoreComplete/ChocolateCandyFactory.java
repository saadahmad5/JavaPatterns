package CreationalPatterns.FactoryPattern.CandyStoreComplete;

public class ChocolateCandyFactory extends CandyFactory {

    @Override
    public Candy getType(CandyTypes candyType) {
        switch (candyType) {
            case CHOCOLATE_DARK -> {
                return new Chocolate_Dark();
            }
            case CHOCOLATE_WHITE -> {
                return new Chocolate_White();
            }
            case CHOCOLATE_MILK -> {
                return new Chocolate_Milk();
            }
        }
        return null;
    }
}
