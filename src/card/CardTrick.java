package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * To be used as starting code in ICE 1
 * @author Sumit Kaplish
 * Student number: 991731685
 */
public class CardTrick {

    // Define the number of cards in the magic hand
    private static final int HAND_SIZE = 7;

    public static void main(String[] args) {
        // Create an array to hold the magic hand
        Card[] magicHand = new Card[HAND_SIZE];

        // Define the suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Generate random cards for the magic hand
        Random rand = new Random();
        System.out.println("Randomly generated cards in the magic hand:");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(suits[rand.nextInt(suits.length)]);
            magicHand[i] = c;
            System.out.println(c.getValue() + " " + c.getSuit());
        }

        // Ask the user to pick a card
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the card value (1-13): ");
        int value = in.nextInt();
        in.nextLine(); // Consume newline
        System.out.println("Enter a suit {Hearts, Diamonds, Clubs, Spades}");
        String usersuit = in.nextLine();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(usersuit);

        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card != null && card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        // Add a lucky card (2 of clubs) to the magic hand
        

        // Check if the lucky card is in the magic hand
        

        // Report the result for the lucky card
        
    }
}
