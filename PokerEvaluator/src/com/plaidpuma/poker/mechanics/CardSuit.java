package com.plaidpuma.poker.mechanics;

public enum CardSuit {
	SPADES     ("spades"),
	HEARTS     ("hearts"),
	DIAMONDS   ("diamonds"),
	CLUBS      ("clubs");

    private String name;

    private CardSuit(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}