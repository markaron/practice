package practicetest.fishtank;

public class Fish {
  private String name;
  private int weight;
  private String color;
  int gain = 1;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public int getGain(){
    return gain;
    }

  public int getWeight(){
    return this.weight;
  }

  public void setWeight(int newWeight){
    this.weight = newWeight;
  }

  public String specialMark(){
    String output= "";
    return output;
  }

  public String fishStatus(){
    String status="";
    return status = getName() + ", weight: " + getWeight() + ", color: " + color + ", " + specialMark() + "\n";
  }
}
