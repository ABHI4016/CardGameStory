package model;

/**
 * Created by cts1 on 18/8/17.
 */
public enum Suit {
    CLUBS(1), DIAMONDS(2), SPADES(3), HEARTS(4);

    private int rank;
    Suit(int rank){
        this.rank = rank;
    }
}
