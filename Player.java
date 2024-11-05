
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;        // Players name
    private List<Card> hand;    // Card Hand ? Players
    private int score;          // Player Score? 

    //Qc Constructors for the Player i.     Fields
    //1. hand (List of Card)
    //2.     score (set to 0 in the constructor)
    //3.     name
    // ii. Methods >
    // 1. Describe (prints out information about the player and calls the describe method for each card in the Hand List)
    // 2.  Flip (removes and returns the top card of the Hand)
    // 3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
    // 4.     incrementScore (adds 1 to the Player’s score field)


    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize hand as an empty list
        this.score = 0;                // Initialize score to 0
    }

    // Method to player's hand 
    public void addCard(Card card) {
        hand.add(card);
    }

    // Method get. player's name
    public String getName() {
        return name;
    }

    // Method to get. hand
    public List<Card> getHand() {
        return hand;
    }

    // Method to get. score
    public int getScore() {
        return score;
    }

    // Method to Player score
    public void setScore(int score) {
        this.score = score;
    }
 
    // Method  Flip the top card
        public Card flip() {
        if (hand.isEmpty()) {
            throw new IllegalStateException("hand is empty");
        }
        return hand.remove(hand.size() - 1); // Removes the top card
    }

    // Method to Points. 
    public void incrementScore() {
        this.score ++;
    }
}
