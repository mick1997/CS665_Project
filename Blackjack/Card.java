package Blackjack;

public class Card {

    private int faceValue; // 1 for A, 11 for J, 12 for Q, 13 for K
    private Suit suit;

    public Card(int c, Suit s) {
        faceValue = c;
        suit = s;
    }

    public int value() {
        return faceValue;
    }

    public Suit suit() {
        return suit;
    }
}
