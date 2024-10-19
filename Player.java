
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;        // Players name
    private List<Card> hand;    // Card Hand ? Players
    private int score;          // Player Score? 

    // Constructors for the Player
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

    // Method to Points. 
    public void incrementScore(int points) {
        this.score += points;
    }
}
