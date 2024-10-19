import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Card {
    private int value; // Integer values
    private String name; // Name of the cards ")

    // Constructor = cards
    public Card(int value) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be between 2 and 14.");
        }
        this.value = value;
        this.name = getCardName(value);
    }

    // Method Names & Values
    private String getCardName(int value) {
        switch (value) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return String.valueOf(value); // For values 2-10
        }
    }

    // Getter for values
    public int getValue() {
        return value;
    }

    // Getter for names
    public String getName() {
        return name;
    }
}
