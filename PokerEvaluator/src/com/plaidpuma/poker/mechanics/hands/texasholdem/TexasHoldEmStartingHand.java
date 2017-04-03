package com.plaidpuma.poker.mechanics.hands.texasholdem;

import com.plaidpuma.poker.mechanics.Card;
import com.plaidpuma.poker.mechanics.InvalidCardException;
import com.plaidpuma.poker.mechanics.hands.Hand;

/**
 * The two face-down hole cards a player receives in Texas Hold 'Em
 */
public class TexasHoldEmStartingHand extends Hand {
    /* 
     * Technically, the order of the cards is irrelevant, so the "proper" data structure representation should be a set
     * But creating a HashSet of two elements feels ridiculous
     * And there's no chance of the number of hole cards changing, that would be a different game
     * So just store the two cards individually
     */
    private Card holeCard1;
    private Card holeCard2;
    
    /**
     * Constructor. Takes text representations of two cards. Whitespace and case will be ignored. 
     * 
     * Examples:
     * 
     * ad kc     ace of diamonds and king of clubs
     * 8D8S      eight of diamonds and eight of spades
     * 
     * @param holeCards 
     */
    public TexasHoldEmStartingHand(String holeCards) {
        // TODO improve validation (handle input that is null, too short, too long...)
        String trimmedAndLowercasedInput = holeCards.trim().toLowerCase();
        String first = trimmedAndLowercasedInput.substring(0,  2);
        trimmedAndLowercasedInput = trimmedAndLowercasedInput.trim().toLowerCase();
        String second = trimmedAndLowercasedInput.substring(0,  2);
        
        try {
            holeCard1 = new Card(first);
            holeCard2 = new Card(second);
        } catch (InvalidCardException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // TODO accessors and such
}
