package gardenapp;

public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    myGarden.addPlants(new Flower("yellow"));
    myGarden.addPlants(new Flower("blue"));
    myGarden.addPlants(new Tree("purple"));
    myGarden.addPlants(new Tree("orange"));
    myGarden.status();
    myGarden.watering(40);
    myGarden.status();
    myGarden.watering(70);
    myGarden.status();
  }
}
