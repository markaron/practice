package fishtanksecond;

public class Koi extends Fish {

  public Koi(String name, int weight, String color) {
    super(name, weight, color);
    super.setGain(2);
  }
}
