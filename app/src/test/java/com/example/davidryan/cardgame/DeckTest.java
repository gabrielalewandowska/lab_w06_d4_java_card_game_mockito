package com.example.davidryan.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidryan on 07/09/2017.
 */

public class DeckTest {
    StubDeck stubDeck;
    Deck deck;

    @Before
    public void before() {
        Card card = new Card(Values.QUEEN, Suits.HEARTS);
        stubDeck = new StubDeck(card);
        deck = new Deck();
    }

    @Test
    public void testDeck() {
        Card card = stubDeck.deal();
        assertEquals(Values.QUEEN, card.getValue());
        assertEquals(Suits.HEARTS, card.getSuit());
    }

    @Test
    public void testTestGenerate() {
        deck.testGenerate();
        System.out.println("Underneath four cards should be dealt in a random order, then null.");
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
    }

    @Test
    public void testGenerate() {
        deck.generate();
        System.out.println("Underneath fifty two different cards should be dealt in a random order, then null.");
        for (int i=0; i<53; i++) {
            System.out.println(deck.deal());
        }
    }

}
