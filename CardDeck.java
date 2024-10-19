
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    
    private List<CardDeck> deck;
      public static void main(String[] args) {

   
      // map deck of cards
        Map<String, String> CardDeck = new HashMap<>();

        //  cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Populate 
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
        private void initializeDeck() {
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
