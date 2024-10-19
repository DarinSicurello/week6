
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;        // Player's name
    private List<Card> hand;    // Player's hand of cards
    private int score;          // Player's score

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize hand as an empty list
        this.score = 0;                // Initialize score to 0
    }

    // Method to add a card to the player's hand
    public void addCard(Card card) {
        hand.add(card);
    }

    // Method to get the player's name
    public String getName() {
        return name;
    }

    // Method to get the player's hand
    public List<Card> getHand() {
        return hand;
    }

    // Method to get the player's score
    public int getScore() {
        return score;
    }

    // Method to set the player's score
    public void setScore(int score) {
        this.score = score;
    }

    // Method to increment the player's score
    public void incrementScore(int points) {
        this.score += points;
    }
}
