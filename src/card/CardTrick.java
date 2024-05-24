/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Saranya Nair Sasidharan
 * @studentNumber 991720621
 * @modifiedDate 2024-05-23
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        
        // Filling magicHand with random cards
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        // Asking user for card value and suit
        System.out.println("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[suitIndex];

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // Adding one hardcoded luck card
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");

        System.out.println("The luck card is: " + luckCard.getValue() + " of " + luckCard.getSuit());
    }
}
