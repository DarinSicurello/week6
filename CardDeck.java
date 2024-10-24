
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    
    private List<CardDeck> deck;
      public static void main(String[] args) {

   
      // map deck of cards
        Map<String, String> CardDeck = new HashMap<>();

        // Q 1b 1.     Fields

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Qb 2  Methods
           // 1. shuffle (randomizes the order of the cards)
           // 2.  draw (removes and returns the top card of the Cards field)
           // 3.  In the constructor, when a new Deck is instantiated,
           //  .. the Cards field should be populated with the standard 52 cards.

        for (String suit : suits) {
            for (String rank : ranks) {
                String cardName = rank + " of " + suit;
                deck.put(cardName, rank);
            }
        }

        // Print  cards
        for (Map.Entry<String, String> entry : deck.entrySet()) {
            System.out.println(entry.getKey());
    }

        // initialize the deck  
        public void initialize (deck);{
        for (int value = 2; value <= 14; value++) 
            deck.add(new Card(value));
        } 
    

        //  shuffle the deck
        public void shuffle() {
        Collections.shuffle(deck);
    }

        //  draw the top card
        public Card draw() {
        if (deck.isEmpty()) {
            throw new IllegalStateException("deck is empty");
        }
        return deck.remove(deck.size() - 1); // Removes the top card
    }

        // get. the current (number) of cards / deck
        public int size() {
        return deck.size();
    }
}
