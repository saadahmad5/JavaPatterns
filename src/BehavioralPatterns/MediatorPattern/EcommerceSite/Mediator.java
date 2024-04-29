package BehavioralPatterns.MediatorPattern.EcommerceSite;

public class Mediator {

    private Customer customer;
    private Site site;
    private Driver driver;

    public Mediator() {
        site = new Site();
        customer = new Customer("731 B PCSIR II");
        driver = new Driver("Saad");
    }

    public void buy(String item, int quantity) {
        if(site.purchase(item, quantity)) {
            System.out.println("Purchase successful! -- " + driver.getName() + " is delivering order of " + quantity + " " + item + " to " + customer.getAddress());
        } else {
            System.out.println("Purchase unsuccessful! -- stock does not have " + quantity + " " + item + " sorry");
        }
    }

    public void getStockStatus() {
        site.showStockStatus();
    }


}
