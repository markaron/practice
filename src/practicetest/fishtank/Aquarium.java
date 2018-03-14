package practicetest.fishtank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
  private List<Fish> aquarium;

  public Aquarium() {
    aquarium = new ArrayList<>();
  }

  public void add(Fish fish) {
    aquarium.add(fish);
  }

  public String status(){
    StringBuilder tempString = new StringBuilder();
    for (int i = 0; i <aquarium.size() ; i++) {
      tempString.append(this.aquarium.get(i).fishStatus());
    }
    String status = tempString.toString();
    return status;
  }

  public void feed(){
    for (int i = 0; i <aquarium.size() ; i++) {
      aquarium.get(i).setWeight(aquarium.get(i).getGain() + aquarium.get(i).getWeight());
      }
    }
  }

