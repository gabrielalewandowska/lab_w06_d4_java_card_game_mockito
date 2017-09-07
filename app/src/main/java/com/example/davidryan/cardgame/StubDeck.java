package com.example.davidryan.cardgame;

/**
 * Created by davidryan on 07/09/2017.
 */

public class StubDeck implements Dealable {
    private Card card;

    public StubDeck(Card card) {
        this.card = card;
    }

    public Card deal() {
        return card;
    }

    public int numberOfCards() { return 1; }

    public void generate() {}
}
