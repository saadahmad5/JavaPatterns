package StructuralPatterns.CompositePattern.EmployeeCertifications;

public class Main {

    public static void main(String[] args) {

        Employee saad = new Employee("Saad", "Ahmad");
        saad.showEntity();

        Certificate azure = new Certificate("Azure Developer Associate", "Jun 2022", "Jun 2024", "Microsoft");
        azure.showEntity();
        Certificate aws = new Certificate("AWS Solutions Architect", "Apr 2023", "May 2026", "Amazon Web Services");
        aws.showEntity();

        Employee fatima = new Employee("Fatima", "Idrees");
        fatima.showEntity();

        Certificate jd = new Certificate("Juris Doctor", "May 2027", "May 2037", "University of Chicago");
        jd.showEntity();

        EmployeeCertifications employeeCertifications = new EmployeeCertifications();
        employeeCertifications.employee = saad;
        employeeCertifications.certificates.add(azure);
        employeeCertifications.certificates.add(aws);
        employeeCertifications.showEntity();

        employeeCertifications = new EmployeeCertifications();
        employeeCertifications.employee = fatima;
        employeeCertifications.certificates.add(jd);
        employeeCertifications.showEntity();


    }

}
