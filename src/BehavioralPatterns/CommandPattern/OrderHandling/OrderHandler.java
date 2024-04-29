package BehavioralPatterns.CommandPattern.OrderHandling;

public class OrderHandler {

    void place(IOrder IOrder) {
        IOrder.invoke();
    }

}
