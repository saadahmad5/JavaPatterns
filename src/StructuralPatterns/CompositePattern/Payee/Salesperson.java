package StructuralPatterns.CompositePattern.Payee;

public class Salesperson implements Payee {

    private String name;
    private Manager manager;

    Salesperson(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    @Override
    public void payExpenses(double amount) {
        System.out.println("Salesperson: " + this.name + " managed by: " + this.manager.getName() + " has paid: $" + amount);
    }
}
