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
        
        for (int i = 0; i < 26; i++) {
            if (deck.size() > 0) {
                Card drawnCard = deck.draw();
                player1.addCard(drawnCard);
                System.out.println("Player 1 (Jane) drew: " + drawnCard.getName() + " (Value: " + drawnCard.getValue() + ")");
                drawnCard = deck.draw();
                player2.addCard(drawnCard);
                System.out.println("Player 2 (John) drew: " + drawnCard.getName() + " (Value: " + drawnCard.getValue() + ")");
            }
        }

        //Q2 c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
        //  Shuffle cards for both players
        
        System.out.println("Flipping cards for both players:");
        for (int i = 0; i < 26; i++) {
            
                Card card1 = player1.flip();
                System.out.println("Player 1 (Jane) flips: " + card1.getName() + " (Value: " + card1.getValue() + ")");
            
            
                Card card2 = player2.flip();
                System.out.println("Player 2 (John) flips: " + card2.getName() + " (Value: " + card2.getValue() + ")");
            
            if (card1.getValue() > card2.getValue()){
            System.out.println("Player 1 wins this round");    
            player1.incrementScore();
            } else if (card1.getValue() < card2.getValue()){
            player2.incrementScore();
            System.out.println("Player 2 wins this round");    
        } else  {
            System.out.println("Nobody wins this round");
        }
        }// End OF Games
        
        //Q d. After the loop, compare the final score from each player.
            if (player1.getScore() > player2.getScore()){
            System.out.println("Player 1 wins the war");    
            } else if (player1.getScore() < player2.getScore()){
            System.out.println("Player 2 wins the war");    
        } else  {
            System.out.println("Nobody wins the war");
        }
        // Q e. Print the final score of each player and either 
        // “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
    }
}
