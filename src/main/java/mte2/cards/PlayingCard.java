// Question: Q3 (mte2, gcis124, 2255)
// Package name: cards
// File name: PlayingCard.java

package mte2.cards;


import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class PlayingCard implements Comparable<PlayingCard> {
    
    private final Suit suit;
    private final Rank rank;

    public PlayingCard(Suit suit, Rank rank) { 
        this.suit = suit;  
        this.rank = rank;  
    }
    
    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }
    
    @Override
    public String toString() { 
        return rank + " of " + suit; 
    }


    @Override
    public int compareTo(PlayingCard other) {
        
        int diff = this.suit.compareTo(other.suit);
        
        if (diff == 0) {
            // Compare rank numbers if suits are the same
            diff = this.rank.getRankNumber() - other.rank.getRankNumber();
        }
        
        return diff;
    }

    public static void main(String[] args) {
        List<PlayingCard> cards = new LinkedList<>();
        
        cards.add(new PlayingCard(Suit.HEARTS, Rank.FIVE));
        cards.add(new PlayingCard(Suit.SPADES, Rank.TEN));
        cards.add(new PlayingCard(Suit.CLUBS, Rank.QUEEN));
        cards.add(new PlayingCard(Suit.DIAMONDS, Rank.TWO));
        cards.add(new PlayingCard(Suit.HEARTS, Rank.ACE));

        System.out.println("Before sort:");
        System.out.println(cards);

        Collections.sort(cards);

        System.out.println("\nAfter sort (by Suit, then Rank):");
        System.out.println(cards);
    }
}