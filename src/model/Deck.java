package model;

import exceptions.DeckFullException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cts1 on 18/8/17.
 */
public class Deck {
    List<Card> cards;
    private Deck(){
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) throws DeckFullException {
        if(this.cards.size() < 5){
            this.cards.add(card);
        }else{
            throw new DeckFullException();
        }
    }

    public static class DeckBuilder{
        Deck deck;
        public DeckBuilder(){
            this.deck = new Deck();
        }
        public DeckBuilder addCard(Card card){
            try{
                this.deck.addCard(card);
            }catch (DeckFullException ex){
                System.out.println("Deck Full");
            }
            return  this;
        }
        public Deck build(){
            return this.deck;
        }
    }
}
