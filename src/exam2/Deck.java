package exam2;

import java.util.*;

public class Deck {
  List<Card> cards;
  List<String> cardValue = new ArrayList<>(Arrays.asList("2","3","4","5","6","7","8","9","10",
          "Jack","Queen","King","Ace"));

  public Deck(int numOfCards) {
    cards = new ArrayList<>();
    addCard(numOfCards);
  }

  public int getDeckSize() {
    return cards.size();
  }

  public int getNumOfClubs() {
    int num = 0;
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getColor().equals("Clubs")) {
        num++;
      }
    }
    return num;
  }

  public int getNumOfDiamonds() {
    int num = 0;
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getColor().equals("Diamonds")) {
        num++;
      }
    }
    return num;
  }

  public int getNumOfHearths() {
    int num = 0;
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getColor().equals("Hearts")) {
        num++;
      }
    }
    return num;
  }

  public int getNumOfSpades() {
    int num = 0;
    for (int i = 0; i < cards.size(); i++) {
      if (cards.get(i).getColor().equals("Spades")) {
        num++;
      }
    }
    return num;
  }

  public void addCard(int numOfCards) {
    int counter = 0;
    for (int i = 0; i < numOfCards; i++) {
      String r = cardValue.get(new Random().nextInt(cardValue.size()));
      if (counter == 0) {
        cards.add(new Card(r, "Clubs"));
        counter = 1;
      } else if (counter == 1) {
        cards.add(new Card(r, "Diamonds"));
        counter = 2;
      } else if (counter == 2) {
        cards.add(new Card(r, "Hearts"));
        counter = 3;
      } else if (counter == 3) {
        cards.add(new Card(r, "Spades"));
        counter = 0;
      }
    }
  }

  public Card draw(){
    Card output;
    shuffleList();
    output = cards.get(0);
    cards.remove(0);
    return output;
  }

  public void shuffleList(){
    Collections.shuffle(cards);
  }

  @Override
  public String toString() {
    return getDeckSize() + " cards - " + getNumOfClubs() + " Clubs, " + getNumOfDiamonds() + " Diamonds, " +
            getNumOfHearths() + " Hearts, " + getNumOfSpades() + " Spades";
  }
}
