import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // Instantiate a deck of cards
        Deck deck = new WeakPairMap.Pair.Weak();

        // Create two players
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        // Shuffle the deck
        deck.shuffle();

        // Draw cards for player 2
        for (int i = 0; i < 52; i++) {
            if (deck.size() > 0) {
                Card drawnCard = deck.draw();
                player2.addCard(drawnCard);
                System.out.println("Player 2 (Bob) drew: " + drawnCard.getName() + " (Value: " + drawnCard.getValue() + ")");
            }
        }

        // Simulate flipping cards for both players
        System.out.println("\nFlipping cards for both players:");
        for (int i = 0; i < 26; i++) {
            if (i < player1.getHand().size()) {
                Card card1 = player1.getHand().get(i);
                System.out.println("Player 1 (Alice) flips: " + card1.getName() + " (Value: " + card1.getValue() + ")");
            }
            if (i < player2.getHand().size()) {
                Card card2 = player2.getHand().get(i);
                System.out.println("Player 2 (Bob) flips: " + card2.getName() + " (Value: " + card2.getValue() + ")");
            }
        }
    }
}
