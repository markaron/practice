package gardenapp;

public class Flower extends Plants {


  public Flower(String color) {
    super(color);
    super.waterAbsorb = 0.75;
    super.type = "Flower";
    super.thirst = 5;
  }
}
