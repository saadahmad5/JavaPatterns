package BehavioralPatterns.CommandPattern.OrderHandling;

public class Main {

    public static void main(String[] args){

        Jacket jacket = new Jacket();

        OrderHandler orderHandler = new OrderHandler();

        orderHandler.place(new SaleOrder(jacket));

        orderHandler.place(new RefundOrder(jacket));
    }

}
