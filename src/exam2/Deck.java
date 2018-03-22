package exam2;

import java.util.ArrayList;
import java.util.List;

public class Deck {
  List<Card> cards;

  public Deck(int numOfCards) {
    cards = new ArrayList<>();
  }

  public void addCard(int numOfCards){
    int counter = 0;
    for (int i = 0; i <numOfCards ; i++) {
      if(i == counter){
        cards.add(new Clubs("1"));

      }
    }
  }
}
