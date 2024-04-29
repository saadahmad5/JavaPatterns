package StructuralPatterns.CompositePattern.Payee;

public class Main {

    public static void main(String[] args) {
        Manager saad = new Manager("Saad");

        Salesperson fatima = new Salesperson("Fatima", saad);
        Salesperson idrees = new Salesperson("Idrees", saad);

        SalesTeam team = new SalesTeam();
        team.addPayees(saad);
        team.addPayees(fatima);
        team.addPayees(idrees);

        team.payExpenses(200);


    }

}
