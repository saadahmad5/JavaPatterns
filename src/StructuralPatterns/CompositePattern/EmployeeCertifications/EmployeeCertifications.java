package StructuralPatterns.CompositePattern.EmployeeCertifications;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCertifications implements EmployeeCertificationsComposition {

    Employee employee;
    List<Certificate> certificates;

    EmployeeCertifications() {
        certificates = new ArrayList<>();
    }

    @Override
    public void showEntity() {
        System.out.println("**************************************************");
        employee.showEntity();
        System.out.println("has following certifications: ");
        certificates.forEach(Certificate::showEntity);
        System.out.println("**************************************************");
    }
}
