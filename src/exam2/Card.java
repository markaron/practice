package exam2;

public abstract class Card {
  private String value;
  private String color;

  public Card(String value) {
    this.value = value;
  }

  public void setColor(String color){
    this.color = color;
  }
}
