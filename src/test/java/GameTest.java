import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        game = new Game(player1, player2,deck);
        game.createDeck();

    }

    @Test
    public void hasDeck(){
        assertEquals(52, game.deck.getRemaining());
    }

    @Test
    public void doesGameDeal(){
        game.dealCards();
        assertEquals(2, game.player1.handCount());
        assertEquals(2, game.player2.handCount());
        assertEquals(48, game.deck.getRemaining());
    }

    @Test
    public void seeWhoWins(){
        game.dealCards();
        game.winner();
    }





}
