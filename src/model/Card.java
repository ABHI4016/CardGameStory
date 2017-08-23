package model;

/**
 * Created by cts1 on 18/8/17.
 */
public class Card {
    private Cards card;
    private Suit suit;

    public Card(Cards card, Suit suit){
        this.card = card;
        this.suit = suit;
    }

    public boolean compare(Card card){
        return true;
    }
}
