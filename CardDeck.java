
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CardDeck {
    
    public List<Card> deck = new ArrayList<Card>(); 
     
      // map deck of cards
        Map<String,String> cardDeck = new HashMap<>();

        // Q 1b 1.     Fields

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Qb 2  Methods
           // 1. shuffle (randomizes the order of the cards)
           // 2.  draw (removes and returns the top card of the Cards field)
           // 3.  In the constructor, when a new Deck is instantiated,
           //  .. the Cards field should be populated with the standard 52 cards.
        public CardDeck(){
        for (String suit : suits) {
            int value = 2;
            for (String rank : ranks) {
                String cardName = rank + " of " + suit;
                Card card = new Card();
                card.setValue(value);
                card.setName(cardName);
                deck.add(card);
                value ++;
            }
        }
    }
        // Print  cards
         public void printCards (){
        for (Card card : deck) {
            System.out.println(card.getName());
    }
}
        // initialize the deck  
       public void initialize (){
        for (int value = 2; value <= 14; value++) {
            deck.add(new Card(value));
        } 
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
