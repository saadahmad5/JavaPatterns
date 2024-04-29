package StructuralPatterns.CompositePattern.Payee;

public class Manager implements Payee {

    private String name;

    Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void payExpenses(double amount) {
        System.out.println("Manager: " + this.name + " has paid: $" + amount);
    }
}
