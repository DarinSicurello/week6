
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<Card> deck;

    // Constructor to initialize the deck of cards
    public CardDeck() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    // Method to initialize the deck with cards from 2 to Ace (2-14)
    private void initializeDeck() {
        for (int value = 2; value <= 14; value++) {
            deck.add(new Card(value));
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Method to draw the top card
    public Card draw() {
        if (deck.isEmpty()) {
            throw new IllegalStateException("The deck is empty. No cards to draw.");
        }
        return deck.remove(deck.size() - 1); // Remove and return the top card
    }

    // Method to get the current number of cards in the deck
    public int size() {
        return deck.size();
    }
}
