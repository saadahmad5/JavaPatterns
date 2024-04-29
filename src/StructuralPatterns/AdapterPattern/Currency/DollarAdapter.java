package StructuralPatterns.AdapterPattern.Currency;

public class DollarAdapter implements Money {

    Money money;

    DollarAdapter(AmericanMoney americanMoney) {
        money = americanMoney;
    }

    @Override
    public String name() {
        return "American";
    }

    @Override
    public double amount() {
        return money.amount() * 300;
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
