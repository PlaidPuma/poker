package com.plaidpuma.poker.mechanics;

public enum CardSuit {
    //@formatter:off
	SPADES     ('s', "spades"),
	HEARTS     ('h', "hearts"),
	DIAMONDS   ('d', "diamonds"),
	CLUBS      ('c', "clubs");
    //@formatter:on

    private char symbol;
    private String name;

    private CardSuit(char symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public static CardSuit getSuitByLetter(char suitLetter) throws InvalidCardException {
        switch (suitLetter) {
            case 's':
            case 'S':
                return SPADES;
            case 'h':
            case 'H':
                return HEARTS;
            case 'd':
            case 'D':
                return DIAMONDS;
            case 'c':
            case 'C':
                return CLUBS;
            default:
                throw new InvalidCardException("Could not create unrecognized suit '"+ suitLetter + "'");
        }
    }
}