package gardenapp;

public class Tree extends Plants {

  public static final double WATER_ABSORB = 0.4;

  public Tree (String color) {
    super(color);
    super.type = "Tree";
    super.waterAbsorb = 0.4;
    super.thirst = 10;
  }

  public static double getWaterAbsorb(){
    return WATER_ABSORB;
  }
}
