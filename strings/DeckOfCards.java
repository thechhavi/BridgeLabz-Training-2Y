package strings;
import java.util.Scanner;

public class DeckOfCards {

    // Suits and ranks
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();
        System.out.println("Original Deck:");
        printDeck(deck);

        // Shuffle deck
        shuffleDeck(deck);
        System.out.println("\nShuffled Deck:");
        printDeck(deck);

        // Input number of players and number of cards per player
        System.out.print("\nEnter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        if (distributedCards != null) {
            // Print players' cards
            printPlayersCards(distributedCards);
        }

        sc.close();
    }

    // Method to initialize deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Cannot distribute " + cardsPerPlayer + " cards to " + players + " players. Not enough cards.");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < players; j++) {
                playerCards[j][i] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    // Method to print the deck
    public static void printDeck(String[] deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        System.out.println("\nPlayers and their cards:");
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j]);
                if (j < playersCards[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
