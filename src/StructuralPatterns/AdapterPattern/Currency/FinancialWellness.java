package StructuralPatterns.AdapterPattern.Currency;

public class FinancialWellness {

    private static final double financialWellnessThreshold = 100000;

    void isFinanciallyWell(Money money) {

        if (money instanceof AmericanMoney) {
            money = new DollarAdapter((AmericanMoney) money);
        }

        if (money.amount() < financialWellnessThreshold) {
            System.out.printf("[UNSTABLE] - Poor %s man has %f %s\n", money.name(), money.amount(), money.currencyUnit());

        } else {
            System.out.printf("[ STABLE ] - Rich %s man has %f %s\n", money.name(), money.amount(), money.currencyUnit());

        }
    }

}
