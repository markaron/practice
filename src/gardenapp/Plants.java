package gardenapp;

public class Plants {
  private double currentWaterAmount;
  double waterAbsorb;
  private String color;
  String type;
  int thirst;

  public Plants(String color) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount * waterAbsorb;
  }

  public void setCurrentWaterAmountForFlower(int currentWaterAmount){
    this.currentWaterAmount = currentWaterAmount * Flower.getWaterAbsorb();
  }

  public String getColor(){
    return color;
  }

  public String getType(){
    return type;
  }

  public String getThirst(){
    String output;
    if (this.isThirsty()){
      return output = "needs water";
    } else {
      return output = "doesn't need water";
    }
  }

  public boolean isThirsty(){
    return (currentWaterAmount < thirst);
  }
}

