package fishtanksecond;

public class Main {
  public static void main(String[] args) {
    Aquarium aquarium = new Aquarium();

    aquarium.add(new Koi("Nami", 9,"pink"));

    System.out.println(aquarium.status());

    aquarium.feed();

    System.out.println(aquarium.status());
  }
}
