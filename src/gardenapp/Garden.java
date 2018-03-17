package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plants> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void addPlants(Plants plants) {
    garden.add(plants);
  }

  public void status() {
    for (int i = 0; i <garden.size() ; i++) {
      System.out.println("The " + garden.get(i).getColor() + garden.get(i).getType() + garden.get(i).getThirst() + "\n");
    }
  }
}

