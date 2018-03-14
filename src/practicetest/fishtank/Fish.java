package practicetest.fishtank;

public class Fish {
  private String name;
  private int weight;
  private String color;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public Fish() {
  }

  public String getName() {
    return name;
  }

  public String fishStatus(){
    String status="";
    return status = getName() + ", weight: " + weight + ", color: " + color + "\n";
  }
}
