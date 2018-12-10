package FinalProject.controller;

import FinalProject.card.Card;

public interface IPlayer {

    void acceptCards(Card[] newCards);
    void think();
    boolean isDone();
    boolean isBlackJack();
    boolean isBusted();
    void addCredit(int amount);
    int getBet();
    boolean isHigher();
}
