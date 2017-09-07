package com.example.davidryan.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidryan on 07/09/2017.
 */

public class PlayerTest {
    Player david;
    Card aceOfSpades;
    Card queenOfDiamonds;

    @Before
    public void before(){
        david = new Player("David");
        aceOfSpades = new Card(Values.ACE, Suits.SPADES);
        queenOfDiamonds = new Card(Values.QUEEN, Suits.DIAMONDS);
    }

    @Test
    public void testCanGetName(){
        assertEquals("David", david.getName());
    }

    @Test
    public void testPlayerHasCard(){
        david.receive(aceOfSpades);
        Card card = david.getLatestCard();
        assertEquals(Values.ACE, card.getValue());
        assertEquals(Suits.SPADES, card.getSuit());
    }

    @Test
    public void testCanGetScore(){
        david.receive(queenOfDiamonds);
        david.receive(aceOfSpades);
        // This would fail if player can receive more than one card!
        assertEquals(14, david.getScore());
    }
}

