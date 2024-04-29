package BehavioralPatterns.CommandPattern.OrderHandling;

public class SaleOrder implements IOrder {

  private final Jacket jacket;

  public SaleOrder(Jacket jacket) {
    this.jacket = jacket;
  }

  @Override
  public void invoke() {

    jacket.sale();

  }
}
