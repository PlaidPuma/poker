package com.plaidpuma.poker.mechanics.hands.texasholdem;

import com.plaidpuma.poker.mechanics.Card;

/**
 * The board, AKA the community cards, for a game of Texas Hold 'Em. Consists of a three-card flop, a one-card turn, and a one-card river.
 */
public class TexasHoldEmBoard {
    /* 
     * Technically, the order of the flop cards is irrelevant, so the "proper" data structure representation should be a set
     * But creating a HashSet (or any set) of three elements feels ridiculous
     * And there's no chance of the number of flop cards changing, that would be a different game
     * So just store the three cards individually
     */

    private Card flopCard1;
    private Card flopCard2;
    private Card flopCard3;
    private Card turnCard;
    private Card riverCard;
    
    // TODO accessors and such
}
