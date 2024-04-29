package StructuralPatterns.CompositePattern.EmployeeCertifications;

public class Employee implements EmployeeCertificationsComposition {

    String firstName;
    String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showEntity() {
        System.out.println("Employee name: " + this.firstName + " " + this.lastName);
    }
}
