package practicetest.fishtank;

public class Tang extends Fish {

  private boolean specialStatus;

  public Tang(String name, int weight, String color, boolean memoryLoss) {
    super(name, weight,color);
    this.specialStatus = memoryLoss;
  }


  @Override
  public String specialMark() {
    String output="";
    return output = "short-term memory loss: " + specialStatus;
  }
}
