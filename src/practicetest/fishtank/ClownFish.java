package practicetest.fishtank;

public class ClownFish extends Fish {


  public ClownFish(String name, int weight, String color) {
    super(name, weight,color);
    super.gain = 1;
  }

}
