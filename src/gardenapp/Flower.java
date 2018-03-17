package gardenapp;

public class Flower extends Plants {

  private  static final double WATER_ABSORB = 0.75;

  public Flower(String color) {
    super(color);
    super.type = "Flower";
    super.waterAbsorb = 0.75;
    super.thirst = 5;
  }

  public static double getWaterAbsorb(){
    return WATER_ABSORB;
  }
}
