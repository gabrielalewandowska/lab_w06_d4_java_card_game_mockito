package com.example.davidryan.cardgame;

/**
 * Created by davidryan on 07/09/2017.
 */

public enum Values {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);


    private final int num;

    private Values(int num) {
        this.num = num;
    }

    public int NUM(){
        return num;
    }
}
