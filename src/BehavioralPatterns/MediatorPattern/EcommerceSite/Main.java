package BehavioralPatterns.MediatorPattern.EcommerceSite;

public class Main {

    public static void main(String[] args){

        Mediator mediator = new Mediator();

        mediator.getStockStatus();

        mediator.buy("pen", 10);
        mediator.buy("pencil", 1);
        mediator.buy("eraser", 5);

        mediator.getStockStatus();

    }

}
