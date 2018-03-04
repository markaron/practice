import java.util.ArrayList;
import java.util.List;

public class Farm {
   List<Animal> animals = new ArrayList<>();
   int numberOfSlots = 2;

  public void add (Animal animal){
    this.animals.add(animal);
  }
  public void breed(){
    if ( numberOfSlots > 0 ){
      Animal animal = new Animal();
      this.animals.add(animal);
      numberOfSlots--;
    } else {
      System.out.println("no more room for animals");
    }
  }

  @Override
  public String toString() {
    return "Farm{" +
            "animals=" + animals +
            ", numberOfSlots= " + numberOfSlots +
            '}';
  }
}
