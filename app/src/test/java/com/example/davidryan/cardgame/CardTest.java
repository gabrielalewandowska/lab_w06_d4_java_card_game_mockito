package com.example.davidryan.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidryan on 07/09/2017.
 */

public class CardTest {
    Card aceOfSpades;
    Card fourOfClubs;

    @Before
    public void before() {
        aceOfSpades = new Card(Values.ACE, Suits.SPADES);
        fourOfClubs = new Card(Values.FOUR, Suits.CLUBS);
    }

    @Test
    public void testAce() {
        assertEquals(Values.ACE, aceOfSpades.getValue());
        assertEquals(Suits.SPADES, aceOfSpades.getSuit());
    }

    @Test
    public void testFour() {
        assertEquals(Values.FOUR, fourOfClubs.getValue());
        assertEquals(Suits.CLUBS, fourOfClubs.getSuit());
    }
}
