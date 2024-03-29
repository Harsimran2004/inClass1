package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Harsimran Singh
 * @author Paul Bonenfant Jan 31, 2024 
 */
public class CardTrick {

    public static void main(String[] args) {
        Random random = new Random();
        int compGuess = random.nextInt(13) + 1; // Make sure to include 13 in the random range

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess (1-13): ");
        int userInput = input.nextInt();

        Card[] hand = new Card[7];
        hand[0] = new Card("Diamonds", 1);
        hand[1] = new Card("Spades", 11);
        hand[2] = new Card("Clubs", 12);
        hand[3] = new Card("Hearts", 13);
        hand[4] = new Card("Diamonds", 10);
        hand[5] = new Card("Spades", 9);
        hand[6] = new Card("Clubs", 7);

        boolean found = false;

        for (int i = 0; i < hand.length; i++) {
            if (userInput == hand[i].getValue()) {
                found = true;
                System.out.println("Your guess is right!");
                printInfo();
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong guess. No match found in the hand.");
        }
    
    
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        // I am done
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Harsimran Singh, but you can call me prof, Hari or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- coding");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
	System.out.println("-- modifying info");

        
    
}

}
