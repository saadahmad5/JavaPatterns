package StructuralPatterns.AdapterPattern.Currency;

public class AmericanMoney implements Money {

    private final double amount;

    public AmericanMoney(double amount) {
        this.amount = amount;
    }

    @Override
    public String name() {
        return "American";
    }

    @Override
    public double amount() {
        return amount;
    }

    @Override
    public String currencyUnit() {
        return "Dollars";
    }

    @Override
    public String toString() {
        return name() + " = " + amount() + " " + currencyUnit();
    }
}
