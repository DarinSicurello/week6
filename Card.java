
public class Card {
    private int value; // Integer value from 2 to 14
    private String name; // Name of the card (e.g., "2", "3", ..., "Jack", "Queen", "King", "Ace")

    // Constructor for numeric cards
    public Card(int value) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be between 2 and 14.");
        }
        this.value = value;
        this.name = getCardName(value);
    }

    // Method to get the name based on the value
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

    // Getter for value
    public int getValue() {
        return value;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
