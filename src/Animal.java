public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat (){
    hunger--;
  }

  public void drink (){
    thirst--;
  }

  public void play(){
    hunger++;
    thirst++;
  }

  @Override
  public String toString() {
    return "## Animal--" +
            "hunger=" + hunger +
            ", thirst=" + thirst +
            '#';
  }

  public static void main(String[] args) {
    Animal koala = new Animal();
    System.out.println(koala.hunger);
    System.out.println(koala.thirst);
  }
}
