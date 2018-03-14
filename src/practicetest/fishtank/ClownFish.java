package practicetest.fishtank;

public class ClownFish extends Fish {


  public ClownFish(String name, int weight, String color, String stripeColor) {
    super(name, weight,color);
    super.gain = 1;
    super.specialStatus = "stripe color: " + stripeColor;
  }
}
