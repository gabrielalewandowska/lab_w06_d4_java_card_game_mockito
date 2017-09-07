package com.example.davidryan.cardgame;

/**
 * Created by davidryan on 07/09/2017.
 */

public interface Dealable {
    Card deal();
    int numberOfCards();
    void generate();
}
