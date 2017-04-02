package com.plaidpuma.poker.mechanics.hands;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.plaidpuma.poker.eval.HandIdentifier;
import com.plaidpuma.poker.mechanics.AnalyzedHand;
import com.plaidpuma.poker.mechanics.Card;
import com.plaidpuma.poker.mechanics.CardRank;
import com.plaidpuma.poker.mechanics.CardSuit;
import com.plaidpuma.poker.mechanics.HandRank;

public class EvaluatedHandTest {

    static Card s2;
    static Card s3;
    static Card s4;
    static Card s5;
    static Card s6;
    static Card s7;
    static Card s8;
    static Card s9;
    static Card sT;
    static Card sJ;
    static Card sQ;
    static Card sK;
    static Card sA;

    static Card h2;
    static Card h3;
    static Card h4;
    static Card h5;
    static Card h6;
    static Card h7;
    static Card h8;
    static Card h9;
    static Card hT;
    static Card hJ;
    static Card hQ;
    static Card hK;
    static Card hA;

    static Card d2;
    static Card d3;
    static Card d4;
    static Card d5;
    static Card d6;
    static Card d7;
    static Card d8;
    static Card d9;
    static Card dT;
    static Card dJ;
    static Card dQ;
    static Card dK;
    static Card dA;

    static Card c2;
    static Card c3;
    static Card c4;
    static Card c5;
    static Card c6;
    static Card c7;
    static Card c8;
    static Card c9;
    static Card cT;
    static Card cJ;
    static Card cQ;
    static Card cK;
    static Card cA;

    Collection<Card> cards;

    @BeforeClass
    public static void createDeck() {
        s2 = new Card(CardSuit.SPADES, CardRank.TWO);
        s3 = new Card(CardSuit.SPADES, CardRank.THREE);
        s4 = new Card(CardSuit.SPADES, CardRank.FOUR);
        s5 = new Card(CardSuit.SPADES, CardRank.FIVE);
        s6 = new Card(CardSuit.SPADES, CardRank.SIX);
        s7 = new Card(CardSuit.SPADES, CardRank.SEVEN);
        s8 = new Card(CardSuit.SPADES, CardRank.EIGHT);
        s9 = new Card(CardSuit.SPADES, CardRank.NINE);
        sT = new Card(CardSuit.SPADES, CardRank.TEN);
        sJ = new Card(CardSuit.SPADES, CardRank.JACK);
        sQ = new Card(CardSuit.SPADES, CardRank.QUEEN);
        sK = new Card(CardSuit.SPADES, CardRank.KING);
        sA = new Card(CardSuit.SPADES, CardRank.ACE);

        h2 = new Card(CardSuit.HEARTS, CardRank.TWO);
        h3 = new Card(CardSuit.HEARTS, CardRank.THREE);
        h4 = new Card(CardSuit.HEARTS, CardRank.FOUR);
        h5 = new Card(CardSuit.HEARTS, CardRank.FIVE);
        h6 = new Card(CardSuit.HEARTS, CardRank.SIX);
        h7 = new Card(CardSuit.HEARTS, CardRank.SEVEN);
        h8 = new Card(CardSuit.HEARTS, CardRank.EIGHT);
        h9 = new Card(CardSuit.HEARTS, CardRank.NINE);
        hT = new Card(CardSuit.HEARTS, CardRank.TEN);
        hJ = new Card(CardSuit.HEARTS, CardRank.JACK);
        hQ = new Card(CardSuit.HEARTS, CardRank.QUEEN);
        hK = new Card(CardSuit.HEARTS, CardRank.KING);
        hA = new Card(CardSuit.HEARTS, CardRank.ACE);

        d2 = new Card(CardSuit.DIAMONDS, CardRank.TWO);
        d3 = new Card(CardSuit.DIAMONDS, CardRank.THREE);
        d4 = new Card(CardSuit.DIAMONDS, CardRank.FOUR);
        d5 = new Card(CardSuit.DIAMONDS, CardRank.FIVE);
        d6 = new Card(CardSuit.DIAMONDS, CardRank.SIX);
        d7 = new Card(CardSuit.DIAMONDS, CardRank.SEVEN);
        d8 = new Card(CardSuit.DIAMONDS, CardRank.EIGHT);
        d9 = new Card(CardSuit.DIAMONDS, CardRank.NINE);
        dT = new Card(CardSuit.DIAMONDS, CardRank.TEN);
        dJ = new Card(CardSuit.DIAMONDS, CardRank.JACK);
        dQ = new Card(CardSuit.DIAMONDS, CardRank.QUEEN);
        dK = new Card(CardSuit.DIAMONDS, CardRank.KING);
        dA = new Card(CardSuit.DIAMONDS, CardRank.ACE);

        c2 = new Card(CardSuit.CLUBS, CardRank.TWO);
        c3 = new Card(CardSuit.CLUBS, CardRank.THREE);
        c4 = new Card(CardSuit.CLUBS, CardRank.FOUR);
        c5 = new Card(CardSuit.CLUBS, CardRank.FIVE);
        c6 = new Card(CardSuit.CLUBS, CardRank.SIX);
        c7 = new Card(CardSuit.CLUBS, CardRank.SEVEN);
        c8 = new Card(CardSuit.CLUBS, CardRank.EIGHT);
        c9 = new Card(CardSuit.CLUBS, CardRank.NINE);
        cT = new Card(CardSuit.CLUBS, CardRank.TEN);
        cJ = new Card(CardSuit.CLUBS, CardRank.JACK);
        cQ = new Card(CardSuit.CLUBS, CardRank.QUEEN);
        cK = new Card(CardSuit.CLUBS, CardRank.KING);
        cA = new Card(CardSuit.CLUBS, CardRank.ACE);
    }
    
    @Before
    public void beforeTest() {
        System.out.println();

        cards = new ArrayList<Card>();
    }

    @Test
    public void testStraightFlushes() {
        cards.clear();
        cards.add(h7);
        cards.add(h8);
        cards.add(h9);
        cards.add(hT);
        cards.add(hJ);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c4);
        cards.add(c2);
        cards.add(cA);
        cards.add(c5);
        cards.add(c3);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dA);
        cards.add(dK);
        cards.add(dQ);
        cards.add(dJ);
        cards.add(dT);
        EvaluatedHand hand3 = new EvaluatedHand(cards); // Technically this one is a royal flush but the system isn't counting that as a separate rank, at least for now

        System.out.println("Straight flushes:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        assertTrue(hand1.getHandRank().equals(HandRank.STRAIGHT_FLUSH));
        assertTrue(hand2.getHandRank().equals(HandRank.STRAIGHT_FLUSH));
        assertTrue(hand3.getHandRank().equals(HandRank.STRAIGHT_FLUSH));
    }

    @Test
    public void testQuads() {
        cards.clear();
        cards.add(h7);
        cards.add(h8);
        cards.add(s7);
        cards.add(d7);
        cards.add(c7);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dK);
        cards.add(dA);
        cards.add(cA);
        cards.add(hA);
        cards.add(sA);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c2);
        cards.add(d2);
        cards.add(s2);
        cards.add(h2);
        cards.add(dT);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        System.out.println("Quads:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        assertTrue(hand1.getHandRank().equals(HandRank.FOUR_OF_A_KIND));
        assertTrue(hand2.getHandRank().equals(HandRank.FOUR_OF_A_KIND));
        assertTrue(hand3.getHandRank().equals(HandRank.FOUR_OF_A_KIND));
    }

    @Test
    public void testFullHouses() {
        cards.clear();
        cards.add(h7);
        cards.add(s7);
        cards.add(d7);
        cards.add(c9);
        cards.add(d9);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(d9);
        cards.add(h9);
        cards.add(cK);
        cards.add(hK);
        cards.add(sK);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c5);
        cards.add(dT);
        cards.add(s5);
        cards.add(hT);
        cards.add(d5);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        System.out.println("Boats:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        assertTrue(hand1.getHandRank().equals(HandRank.FULL_HOUSE));
        assertTrue(hand2.getHandRank().equals(HandRank.FULL_HOUSE));
        assertTrue(hand3.getHandRank().equals(HandRank.FULL_HOUSE));
    }

    @Test
    public void testFlushes() {
        cards.clear();
        cards.add(h7);
        cards.add(h9);
        cards.add(hT);
        cards.add(hQ);
        cards.add(hA);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(d9);
        cards.add(d6);
        cards.add(d4);
        cards.add(d3);
        cards.add(d2);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c5);
        cards.add(cA);
        cards.add(c7);
        cards.add(c2);
        cards.add(cQ);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        System.out.println("Flushes:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        assertTrue(hand1.getHandRank().equals(HandRank.FLUSH));
        assertTrue(hand2.getHandRank().equals(HandRank.FLUSH));
        assertTrue(hand3.getHandRank().equals(HandRank.FLUSH));
    }

    @Test
    public void testStraights() {
        cards.clear();
        cards.add(s5);
        cards.add(s6);
        cards.add(d7);
        cards.add(d8);
        cards.add(h9);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dQ);
        cards.add(cJ);
        cards.add(cT);
        cards.add(h9);
        cards.add(s8);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c4);
        cards.add(s2);
        cards.add(h6);
        cards.add(h3);
        cards.add(d5);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(cA);
        cards.add(dK);
        cards.add(cT);
        cards.add(dJ);
        cards.add(cQ);
        EvaluatedHand hand4 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(h3);
        cards.add(d5);
        cards.add(s2);
        cards.add(h4);
        cards.add(sA);
        EvaluatedHand hand5 = new EvaluatedHand(cards);

        System.out.println("Straights:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);
        System.out.println(hand5);

        assertTrue(hand1.getHandRank().equals(HandRank.STRAIGHT));
        assertTrue(hand2.getHandRank().equals(HandRank.STRAIGHT));
        assertTrue(hand3.getHandRank().equals(HandRank.STRAIGHT));
        assertTrue(hand4.getHandRank().equals(HandRank.STRAIGHT));
        assertTrue(hand5.getHandRank().equals(HandRank.STRAIGHT));
    }

    @Test
    public void testThreeOfAKinds() {
        cards.clear();
        cards.add(s5);
        cards.add(c5);
        cards.add(d5);
        cards.add(d8);
        cards.add(h9);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dQ);
        cards.add(cJ);
        cards.add(cT);
        cards.add(hT);
        cards.add(sT);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c4);
        cards.add(s3);
        cards.add(d3);
        cards.add(h3);
        cards.add(d5);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(cA);
        cards.add(dK);
        cards.add(dJ);
        cards.add(sA);
        cards.add(dA);
        EvaluatedHand hand4 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c2);
        cards.add(d5);
        cards.add(s2);
        cards.add(h2);
        cards.add(sA);
        EvaluatedHand hand5 = new EvaluatedHand(cards);

        System.out.println("Drilling:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);
        System.out.println(hand5);

        assertTrue(hand1.getHandRank().equals(HandRank.THREE_OF_A_KIND));
        assertTrue(hand2.getHandRank().equals(HandRank.THREE_OF_A_KIND));
        assertTrue(hand3.getHandRank().equals(HandRank.THREE_OF_A_KIND));
        assertTrue(hand4.getHandRank().equals(HandRank.THREE_OF_A_KIND));
        assertTrue(hand5.getHandRank().equals(HandRank.THREE_OF_A_KIND));
    }

    @Test
    public void testTwoPairs() {
        cards.clear();
        cards.add(s5);
        cards.add(c8);
        cards.add(d5);
        cards.add(d8);
        cards.add(h9);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dQ);
        cards.add(cQ);
        cards.add(cT);
        cards.add(hT);
        cards.add(sA);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c4);
        cards.add(s3);
        cards.add(dJ);
        cards.add(h3);
        cards.add(d4);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(cA);
        cards.add(dK);
        cards.add(hJ);
        cards.add(dJ);
        cards.add(sA);
        EvaluatedHand hand4 = new EvaluatedHand(cards);

        System.out.println("Two pairs:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);

        assertTrue(hand1.getHandRank().equals(HandRank.TWO_PAIR));
        assertTrue(hand2.getHandRank().equals(HandRank.TWO_PAIR));
        assertTrue(hand3.getHandRank().equals(HandRank.TWO_PAIR));
        assertTrue(hand4.getHandRank().equals(HandRank.TWO_PAIR));
    }

    @Test
    public void testOnePairs() {
        cards.clear();
        cards.add(s5);
        cards.add(c5);
        cards.add(dA);
        cards.add(d8);
        cards.add(h9);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(dQ);
        cards.add(cJ);
        cards.add(c2);
        cards.add(hT);
        cards.add(sT);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c4);
        cards.add(s3);
        cards.add(d2);
        cards.add(h3);
        cards.add(d5);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(cA);
        cards.add(dK);
        cards.add(d5);
        cards.add(dJ);
        cards.add(sA);
        EvaluatedHand hand4 = new EvaluatedHand(cards);

        System.out.println("Pairs:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);

        assertTrue(hand1.getHandRank().equals(HandRank.ONE_PAIR));
        assertTrue(hand2.getHandRank().equals(HandRank.ONE_PAIR));
        assertTrue(hand3.getHandRank().equals(HandRank.ONE_PAIR));
        assertTrue(hand4.getHandRank().equals(HandRank.ONE_PAIR));
    }

    @Test
    public void testHighCards() {
        cards.clear();
        cards.add(h7);
        cards.add(h9);
        cards.add(dT);
        cards.add(hQ);
        cards.add(hA);
        EvaluatedHand hand1 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c9);
        cards.add(s4);
        cards.add(d6);
        cards.add(h3);
        cards.add(d2);
        EvaluatedHand hand2 = new EvaluatedHand(cards);

        cards.clear();
        cards.add(c5);
        cards.add(cA);
        cards.add(c7);
        cards.add(c2);
        cards.add(sQ);
        EvaluatedHand hand3 = new EvaluatedHand(cards);

        System.out.println("High cards:");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);

        assertTrue(hand1.getHandRank().equals(HandRank.HIGH_CARD));
        assertTrue(hand2.getHandRank().equals(HandRank.HIGH_CARD));
        assertTrue(hand3.getHandRank().equals(HandRank.HIGH_CARD));
    }
}
