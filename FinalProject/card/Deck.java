package FinalProject.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private static final Random random = new Random();

    private final List<Card> cards = new ArrayList<>();
    private int dealIndex = 0;

    public Deck(int numOfDeck) {
        // one deck of cards
        if (numOfDeck == 1) {
            for (int i = 1; i <= 13; i++) {
                for (Suit suit : Suit.values()) {
                    cards.add(new Card(i, suit));
                }
            }
        }
        // two decks of cards
        else {
            for (int j = 1; j <= numOfDeck; j++) {
                for (int i = 1; i <= 13; i++) {
                    for (Suit suit : Suit.values()) {
                        cards.add(new Card(i, suit));
                    }
                }
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.size() - 1; i++) {
            int j = random.nextInt(cards.size() - i) + i;
            Card card1 = cards.get(i);
            Card card2 = cards.get(j);
            cards.set(i, card2);
            cards.set(j, card1);
        }
    }

    private int remainingCards() {
        return cards.size() - dealIndex;
    }

    protected Card[] dealHand(int number) {
        if (remainingCards() < number) {
            return null;
        }

        Card[] cards = new Card[number];

        for (int i = 0; i < number; i++) {
            cards[i] = dealCard();
        }
        return cards;
    }

    private Card dealCard() {

        if (remainingCards() == 0) {
            return null;
        }
        else {
            return cards.get(dealIndex++);
        }
    }

}
