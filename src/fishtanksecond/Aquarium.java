package fishtanksecond;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
  List<Fish> aquarium;

  public Aquarium() {
    aquarium = new ArrayList<>();
  }

  public void add(Fish fish){
    aquarium.add(fish);
  }

  public void feed(){
    for (int i = 0; i <aquarium.size() ; i++) {
      aquarium.get(i).setWeight();
    }
  }

  public String status(){
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < aquarium.size(); i++) {
      output.append(aquarium.get(i).statusFish());
    }
    return output.toString();
  }

  public void removeOversizedFishes(){
    for (int i = 0; i <aquarium.size() ; i++) {
      if (aquarium.get(i).getWeight() >= 11){
        aquarium.remove(i);
      }
    }
  }
}
