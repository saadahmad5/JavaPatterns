package StructuralPatterns.CompositePattern.EmployeeCertifications;

public class Certificate implements EmployeeCertificationsComposition {

    String certificationName;
    String issueDate;
    String expiryDate;
    String issuer;

    Certificate(String certificationName, String issueDate, String expiryDate, String issuer) {
        this.certificationName = certificationName;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.issuer = issuer;
    }

    @Override
    public void showEntity() {
        System.out.printf("%-30s\t\t -- Valid from: %s \t Valid until: %s \t issued by: %s\n", certificationName, issueDate, expiryDate, issuer);
    }
}
