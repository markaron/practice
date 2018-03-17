package gardenapp;

public class Tree extends Plants {
  public Tree (String color) {
    super(color);
    super.waterAbsorb = 0.4;
    super.type = "Tree";
    super.thirst = 10;
  }
}
