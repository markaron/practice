package practicetest.fishtank;

public class FishTank {
  public static void main(String[] args) {
    Aquarium aquarium = new Aquarium();

    aquarium.add(new ClownFish("Nemo",5,"orange"));
    System.out.println(aquarium.status());
    aquarium.feed();
    System.out.println(aquarium.status());
  }
}
