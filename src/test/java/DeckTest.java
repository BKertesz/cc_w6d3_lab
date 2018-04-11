import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.HEARTS,Rank.ACE);
    }

    @Test
    public void has52Cards(){
        assertEquals(52,deck.getRemaining());
    }

    @Test
    public void printDeck(){
        deck.shuffle();
        deck.printCards();
    }

    @Test
    public void canGetCard(){
        Card myCard = deck.getCard();
        assertEquals(card.getSuit(),myCard.getSuit());
        assertEquals(card.getRank(),myCard.getRank());
    }

}
