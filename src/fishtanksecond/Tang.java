package fishtanksecond;

public class Tang extends Fish {

  private boolean memory;

  public Tang(String name, int weight, String color, boolean memory) {
    super(name, weight, color);
    this.memory = memory;
  }

  public boolean isMemory() {
    return memory;
  }

  @Override
  public String statusFish() {
    String output = getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short term memory loss: " +
            isMemory() + "\n";
    return output;
  }
}
