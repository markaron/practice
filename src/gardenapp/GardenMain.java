package gardenapp;

public class GardenMain {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlants(new Flower("yellow"));
    garden.addPlants(new Flower("blue"));
    garden.addPlants(new Tree("purple"));
    garden.addPlants(new Tree("orange"));
    garden.status();
    garden.watering(40);
    garden.status();
    garden.watering(70);
    garden.status();
  }
}
