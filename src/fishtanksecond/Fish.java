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

  public String status(){
    String output = "";
    return output;
  }

  public void feed (){
    this.weight += this.gain;
  }
}
