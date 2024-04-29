package StructuralPatterns.AdapterPattern.Currency;

public class PakistaniMoney implements Money {

    private final double amount;

    public PakistaniMoney(double amount) {
        this.amount = amount;
    }


    @Override
    public String name() {
        return "Pakistani";
    }

    @Override
    public double amount() {
        return amount;
    }

    @Override
    public String currencyUnit() {
        return "Rupees";
    }

    @Override
    public String toString() {
        return name() + " = " + amount() + " " + currencyUnit();
    }
}
