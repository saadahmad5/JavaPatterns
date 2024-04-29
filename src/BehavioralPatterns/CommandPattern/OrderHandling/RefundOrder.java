package BehavioralPatterns.CommandPattern.OrderHandling;

public class RefundOrder implements IOrder {

  private final Jacket jacket;

  public RefundOrder(Jacket jacket) {
    this.jacket = jacket;
  }

  @Override
  public void invoke() {
    jacket.refund();
  }

}
