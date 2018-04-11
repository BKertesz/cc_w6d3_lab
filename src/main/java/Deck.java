import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        populate();
        shuffle();
    }

    public void populate(){

        for(Suit suit : Suit.values() ){
            for (Rank rank:Rank.values()) {
                Card card = new Card(suit,rank);
                cards.add(card);
            }
        }

    }

    public int getRemaining(){
        return cards.size();
    }

    public void printCards(){
        for(Card card:cards){

            System.out.println(card.getSuit());
            System.out.println(card.getRank());
        }
    }

    public Card getCard(){
        return cards.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }


}
