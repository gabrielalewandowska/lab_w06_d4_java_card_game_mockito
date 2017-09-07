package com.example.davidryan.cardgame;

/**
 * Created by davidryan on 07/09/2017.
 */

public class Card {
    private Suits suit;
    private Values value;

    public Card(Values value, Suits suit){
        this.suit = suit;
        this.value = value;
    }

    public Suits getSuit() {
        return suit;
    }

    public Values getValue() {
        return value;
    }

    public String toString() {
        return value + " of " + suit;
    }

    public int getScore() {
        return value.NUM();
    }

}
