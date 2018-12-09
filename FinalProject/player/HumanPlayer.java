package FinalProject.player;

import FinalProject.card.Card;
import FinalProject.controller.ICardProvider;
import FinalProject.controller.IGamePolicy;
import FinalProject.controller.IPlayer;

public class HumanPlayer extends Player implements IPlayer, ICardProvider, IGamePolicy {


    @Override
    public void acceptCards(Card[] newCards) {

    }

    @Override
    public void think() {

    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public boolean isBlackJack() {
        return false;
    }

    @Override
    public boolean isBusted() {
        return true;
    }

    @Override
    public void addCredit(int amount) {

    }

    @Override
    public int getBet() {
        return 0;
    }

    @Override
    public Card[] getNext(int count) {
        return new Card[0];
    }

    @Override
    public boolean isPlayerWin(IPlayer dealer, IPlayer player) {
        return false;
    }
}
