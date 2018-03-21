package fishtanksecond;

public class Fish {
  private String name;
  private int weight;
  private String color;
  private int gain;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
    this.gain = 1;
  }

  public void setGain (int newGain){
    this.gain = newGain;
  }

  public int getGain() {
    return gain;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public  int setWeight(){
    return weight += gain;
  }

  public String getColor() {
    return color;
  }

  public String statusFish(){
    String output = name + ", weight: " + weight + ", color: " + color;
    return output;
  }
}
