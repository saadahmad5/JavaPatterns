package StructuralPatterns.CompositePattern.Payee;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {

    List<Payee> payees;

    SalesTeam() {
        payees = new ArrayList<>();
    }

    public void addPayees(Payee payee) {
        payees.add(payee);
    }

    @Override
    public void payExpenses(double amount) {
        payees.forEach(payee -> payee.payExpenses(amount));
    }
}
