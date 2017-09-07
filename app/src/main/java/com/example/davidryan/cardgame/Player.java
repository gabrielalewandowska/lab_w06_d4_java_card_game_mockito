package com.example.davidryan.cardgame;

/**
 * Created by davidryan on 07/09/2017.
 */

public class Player {
    private String name;
    private Card card;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card getLatestCard() {
        return card;
    }

    public void receive(Card card) {
        this.card = card;
    }

    public int getScore() {
        if (card==null) {return 0;}
        return card.getScore();
    }
}
