import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        card1 = new Card(Suit.HEARTS, Rank.NINE);
        card2 = new Card(Suit.CLUBS, Rank.FIVE);
    }

    @Test
    public void doesPlayerStartWithNoCards(){
        assertEquals(0, player1.handCount());
    }


    @Test
    public void doesPlayerHaveCards(){
        player1.storeCard(card1);
        assertEquals(1, player1.handCount());
    }

    @Test
    public void canDropCards(){
        player1.storeCard(card1);
        player1.dropHand();
        assertEquals(0, player1.handCount());
    }

    @Test
    public void playerTotalValue(){
        player1.storeCard(card1);
        assertEquals(9,player1.totalValue());
    }
}
