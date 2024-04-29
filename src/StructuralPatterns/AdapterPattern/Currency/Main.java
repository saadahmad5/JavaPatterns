package StructuralPatterns.AdapterPattern.Currency;

public class Main {

    public static void main(String[] args) {
        System.out.println("Adapter Pattern!");

        FinancialWellness fw = new FinancialWellness();

        AmericanMoney american = new AmericanMoney(5000);
        System.out.println(american);
        fw.isFinanciallyWell(american);

        PakistaniMoney pakistani = new PakistaniMoney(200000);
        System.out.println(pakistani);
        fw.isFinanciallyWell(pakistani);

    }

}
