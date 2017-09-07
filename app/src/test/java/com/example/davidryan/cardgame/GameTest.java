package com.example.davidryan.cardgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidryan on 07/09/2017.
 */

public class GameTest {
    Player david;
    Player gaby;
    Player jaguar;
    Dealable deck;
    Dealable spyDeck;
    Game game;

    @Before
    public void before(){
        david = new Player("David");
        gaby = new Player("Gaby");
        jaguar = new Player("Leaping Jaguar");
        deck = new Deck();
//        spyDeck = Mockito.spy(deck);
        deck.generate();
//        game = new Game(spyDeck);
        game = new Game(deck);
        game.add(david);
        game.add(gaby);
        game.add(jaguar);
    }

    @Test
    public void testNumberOfPlayers(){
        assertEquals(3, game.numberOfPlayers());
    }

    @Test
    public void testDeck(){
        assertEquals(52, game.getDeck().numberOfCards());
    }

    @Test
    public void testMockDeal() {
        game.dealRound();
        Player winner = game.winner();
//        assertEquals("Gaby", game.winner().getName());
    }


}
