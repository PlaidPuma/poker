package com.plaidpuma.poker.mechanics;

public enum CardRank
{
    DEUCE	('2', 2),
    TREY	('3', 3),
    FOUR	('4', 4),
    FIVE	('5', 5),
    SIX		('6', 6),
    SEVEN	('7', 7),
    EIGHT	('8', 8),
    NINE	('9', 9),
    TEN		('T', 10),
    JACK	('J', 11),
    QUEEN	('Q', 12),
    KING	('K', 13),
    ACE		('A', 14);

	private char symbol;
	private int value;

    private CardRank(char symbol, int value)
    {
        this.symbol = symbol;
        this.value = value;
    }

    public char getSymbol()
    {
        return this.symbol;
    }

    public int getValue()
    {
        return this.value;
    }
}