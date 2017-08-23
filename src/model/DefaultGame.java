package model;

/**
 * Created by cts1 on 23/8/17.
 */
public class DefaultGame extends Game {

    public

    @Override
    public Player whoWon() {
        Player player1 = new Player(new Deck.DeckBuilder()
                .addCard(new Card(Cards.ACE, Suit.CLUBS))
                .addCard(new Card(Cards.TWO, Suit.HEARTS))
                .addCard(new Card(Cards.TEN, Suit.DIAMONDS))
                .addCard(new Card(Cards.SIX, Suit.DIAMONDS))
                .addCard(new Card(Cards.ACE, Suit.SPADES)).build()
                );
        return null;
    }
}
