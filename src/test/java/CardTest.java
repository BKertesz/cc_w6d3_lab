import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;

    @Before
    public void before(){
        card1 = new Card(Suit.HEARTS,Rank.ACE);
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.HEARTS,card1.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.ACE,card1.getRank());
    }
}
