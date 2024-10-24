import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    // Q 2a.Instantiate a Deck and two Players
    // call the shuffle method on the deck.

     
public class App {
    public static void main(String[] args) {
        // Deck of cards
        CardDeck deck = new CardDeck();

        // Create two players
        Player player1 = new Player("Jane");
        Player player2 = new Player("John");

        // Shuffle deck
        deck.shuffle();
        //Q2b b. Using a traditional for loop, iterate 52 times calling the Draw method
        //on the other player each iteration using the Deck you instantiated.//
        // Draw cards for player 2
        
        for (int i = 0; i < 52; i++) {
            if (deck.size() > 0) {
                Card drawnCard = deck.draw();
                player2.addCard(drawnCard);
                System.out.println("Player 2 (John) drew: " + drawnCard.getName() + " (Value: " + drawnCard.getValue() + ")");
            }
        }

        //Q2 c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
        //  Shuffle cards for both players
        
        System.out.println("Shuffle cards for both players:");
        for (int i = 0; i < 26; i++) {
            if (i < player1.getHand().size()) {
                Card card1 = player1.getHand().get(i);
                System.out.println("Player 1 (Jane) flips: " + card1.getName() + " (Value: " + card1.getValue() + ")");
            }
            if (i < player2.getHand().size()) {
                Card card2 = player2.getHand().get(i);
                System.out.println("Player 2 (John) flips: " + card2.getName() + " (Value: " + card2.getValue() + ")");
            }
        }
        
        //Q d. After the loop, compare the final score from each player.
        
        // Q e. Print the final score of each player and either 
        // “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
    }
}
