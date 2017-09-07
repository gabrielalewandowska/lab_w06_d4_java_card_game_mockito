package com.example.davidryan.cardgame;

import java.util.ArrayList;

/**
 * Created by davidryan on 07/09/2017.
 */

public class Game {
    ArrayList<Player> players;
    Dealable deck;

    public Game(Dealable deck){
        this.deck = deck;
        players = new ArrayList<Player>();
    }

    public Dealable getDeck() {
        return deck;
    }

    public void add(Player player){
        players.add(player);
    }

    public int numberOfPlayers(){
        return players.size();
    }

    public void dealRound() {
        for (Player player: players) {
            Card card = deck.deal();
            player.receive(card);
            //Visibility!!
            System.out.println(player.getName() + " receives " + card);
        }
    }

    public Player winner() {
        int theScore = 0;
        Player theWinner = null;
        for (Player player: players) {
            int playerScore = player.getScore();
            if ( theScore==playerScore ){
                theWinner = null;
            } else if ( theScore < playerScore ) {
                theWinner = player;
                theScore = playerScore;
            }
        }
        if (theWinner==null) {
            System.out.println("Draw with a score of " + theScore);
        } else {
            System.out.println("Winner is " + theWinner.getName() + " with a score of " + theScore);
        }
        return theWinner;
    }

}
