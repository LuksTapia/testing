package org.example.testing.players;

public class Player {

    private Dice dice;
    private int minToWin;

    //Constructor
    public Player(Dice d, int minToWin) {
        setDice(d);
        setMinToWin(minToWin);
    }

    public Player() {

    }

    //Methods
    public Dice getDice() {
        return this.dice;
    }
    private void setDice(Dice dice) {
        this.dice = dice;
    }

    private void setMinToWin(int minToWin) {
        this.minToWin = minToWin;
    }

    public int getMinToWin() {
        return this.minToWin;
    }

    public boolean play() {
       return this.dice.roll() > this.minToWin;
    };

}
