package com.example.davidryan.cardgame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by davidryan on 07/09/2017.
 */

public class Deck implements Dealable {
    private ArrayList<Card> cards;
    private Random rand;

    public Deck() {
        cards = new ArrayList<Card>();
        rand = new Random();
    }

    @Override
    public Card deal() {
        if (cards.size()<1) {return null;}
        int index = rand.nextInt(cards.size());
        Card chosenCard = cards.get(index);
        cards.remove(index);
        return chosenCard;
    }

    public void testGenerate() {
        cards.add(new Card(Values.ACE, Suits.CLUBS));
        cards.add(new Card(Values.KING, Suits.SPADES));
        cards.add(new Card(Values.EIGHT, Suits.SPADES));
        cards.add(new Card(Values.FIVE, Suits.DIAMONDS));
    }

    public void generate(){
        for (Values value : Values.values()){
            for (Suits suit : Suits.values()){
                cards.add(new Card(value, suit));
            }
        }
    }

    public int numberOfCards() {
        return cards.size();
    }

}
