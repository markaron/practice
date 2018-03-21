package fishtanksecond;

public class ClownFish extends Fish {

  private String stripe;

  public ClownFish(String name, int weight, String color, String stripe) {
    super(name, weight, color);
    this.stripe = stripe;
  }

  @Override
  public String statusFish() {
    String output = getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", stripe color: "
            + stripe + "\n";
    return output;
  }
}
