import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Card {
    private int value; // Integer values
    private String name; // Name of the cards ")
    // Q1a  Fields
    // 1. value (contains a value from 2-14 representing cards 2-Ace)
    // 2.     name (e.g. Ace of Diamonds, or Two of Hearts)
    // ii.    Methods
    // 1.     Getters and Setters
    // 2.     describe (prints out information about a card)

    // Constructor = cards
    public Card(String name, int value) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be between 2 and 14.");
        }
        this.value = value;
        this.name = getCardName(value);
    }
    public Card(){}
    public Card(int value) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be between 2 and 14.");
        }
        this.value = value;
        this.name = getCardName(value);
    }
    // Method Names & Values
    public String getCardName(int value) {
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
    //// Setter for values
    public void setValue(int value){
        this.value = value;
    }
    // Getter for names
    public String getName() {
        return name;
    }
    //// setter for names
    public void setName(String name){
        this.name = name;
    }
}
