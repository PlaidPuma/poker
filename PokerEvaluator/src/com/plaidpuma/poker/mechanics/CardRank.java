package com.plaidpuma.poker.mechanics;

public enum CardRank {
    //@formatter:off
    TWO     ('2', 2, "deuce", "deuces"),
    THREE   ('3', 3, "trey", "treys"),
    FOUR    ('4', 4, "four", "fours"),
    FIVE    ('5', 5, "five", "fives"),
    SIX     ('6', 6, "six", "sixes"),
    SEVEN   ('7', 7, "seven", "sevens"),
    EIGHT   ('8', 8, "eight", "eights"),
    NINE    ('9', 9, "nine", "nines"),
    TEN     ('T', 10, "ten", "tens"),
    JACK    ('J', 11, "jack", "jacks"),
    QUEEN   ('Q', 12, "queen", "queens"),
    KING    ('K', 13, "king", "kings"),
    ACE     ('A', 14, "ace", "aces"); // TODO: what if aces are low, as in A-5 straights and some lowball games?
    //@formatter:on

	private char symbol;
	private int value;
	private String nameSingular;
	private String namePlural;

    private CardRank(char symbol, int value, String nameSingular, String namePlural)
    {
        this.symbol = symbol;
        this.value = value;
        this.nameSingular = nameSingular;
        this.namePlural = namePlural;
    }

    public char getSymbol()
    {
        return this.symbol;
    }

    public int getValue()
    {
        return this.value;
    }

    public String getNameSingular()
    {
        return this.nameSingular;
    }

    public String getNamePlural()
    {
        return this.namePlural;
    }

    public static CardRank getRankByLetter(char rankLetter) throws InvalidCardException {
        switch (rankLetter) {
        case '2':
            return TWO;
        case '3':
            return THREE;
        case '4':
            return FOUR;
        case '5':
            return FIVE;
        case '6':
            return SIX;
        case '7':
            return SEVEN;
        case '8':
            return EIGHT;
        case '9':
            return NINE;
        case 't':
        case 'T':
            return TEN;
        case 'j':
        case 'J':
            return JACK;
        case 'q':
        case 'Q':
            return QUEEN;
        case 'k':
        case 'K':
            return KING;
        case 'a':
        case 'A':
            return ACE;
        default:
            throw new InvalidCardException("Could not create unrecognized card rank '"+ rankLetter + "'");
        }
    }
}