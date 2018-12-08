package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    protected final List<Card> cards = new ArrayList<>();

    public int score() {

        int score = 0;
        for (Card card : cards) {
            score += card.getFaceValue();
        }
        return score;
    }

    protected void addCards(Card[] c) {
        Collections.addAll(cards, c);
    }

    protected int size() {
        return cards.size();
    }
}
