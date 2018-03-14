package practicetest.fishtank;

public class ClownFish extends Fish {

  private String stripeColor;

  public ClownFish(String name, int weight, String color, String stripeColor) {
    super(name, weight,color);
    this.stripeColor = stripeColor;
  }


  @Override
  public String specialMark() {
    String output="";
    return output = "stripe color: " + stripeColor;
  }
}
