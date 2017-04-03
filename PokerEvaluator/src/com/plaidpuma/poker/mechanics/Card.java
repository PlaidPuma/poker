package com.plaidpuma.poker.mechanics;

public class Card implements Comparable<Card> {
	private CardSuit suit;
	private CardRank rank;
	
	/**
	 * /              [start of regex]  
	 * \A             start of string
	 * [2-9tjqka]     card rank; i.e. one of the characters from 2 to 9, or t, j, q, k or a
	 * [shdc]         card suit; i.e. one of the characters s, h, d or c
	 * \z             end of string
	 * /              [separator between body of regex proper and regex options]
	 * i              case-insensitive
	 * /              [end of regex]                  
	 */
	public static final String TEXT_CARD_REGEX = "/\\A[2-9tjqka][shdc]\\z/i/";
	
	public Card(CardSuit suit, CardRank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card(String rankAndSuit) throws InvalidCardException {
	    validateRankAndSuitInput(rankAndSuit);
	    
        char rankLetter = rankAndSuit.charAt(0);
        char suitLetter = rankAndSuit.charAt(1);
        
        rank = CardRank.getRankByLetter(rankLetter);
        suit = CardSuit.getSuitByLetter(suitLetter);
	}
	
	private void validateRankAndSuitInput(String rankAndSuit) throws InvalidCardException {
	    if(rankAndSuit.length() != 2) {
	        throw new InvalidCardException("Unexpected length of card input (expected two characters, e.g. \"as\" for ace of spaces or \"8D\" for 8 of diamonds");
	    }
	    
	    if(!rankAndSuit.matches(TEXT_CARD_REGEX)) {
	        throw new InvalidCardException("Unepxected content in card input (expected two characters, e.g. \"as\" for ace of spaces or \"8D\" for 8 of diamonds");
	    }
	}
	
	public CardSuit getSuit() {
		return suit;
	}
	
	public CardRank getRank() {
		return rank;
	}
	
	public int getValue() {
		return rank.getValue();
	}

	@Override
	public int compareTo(Card otherCard) {
		return rank.compareTo(otherCard.getRank());
	}
}