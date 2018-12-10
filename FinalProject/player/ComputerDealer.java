package FinalProject.player;

import FinalProject.card.Card;
import FinalProject.controller.ICardProvider;
import FinalProject.controller.IGamePolicy;
import FinalProject.controller.IPlayer;
import FinalProject.controller.ScoreAdjust;

import java.util.Arrays;

public class ComputerDealer extends Player implements IPlayer, IGamePolicy, ICardProvider {

    private ScoreAdjust scores;
    private Card card;
    private int amount;
    private static ComputerDealer instance = new ComputerDealer();

    private ComputerDealer() {}

    public ComputerDealer getInstance() {
        if (instance == null) {
            return new ComputerDealer();
        }
        return instance;
    }

    // getNext ???
    @Override
    public Card[] getNext(int count) {
        return new Card[0];
    }

    @Override
    public boolean isPlayerWin(IPlayer dealer, IPlayer player) {
        return dealer.isBlackJack() || dealer.isHigher();
    }

    @Override
    public void acceptCards(Card[] newCards) {
        System.out.println("The card received are: " + Arrays.toString(newCards));
    }

    // thinking ???
    @Override
    public void think() {

    }

    @Override
    public boolean isDone() {
        return isBlackJack() || isBusted() || isHigher();
    }

    @Override
    public boolean isBlackJack() {
        return scores.score() == 21;
    }

    // isHigher ???
    @Override
    public boolean isHigher() {
        return false;
    }

    @Override
    public boolean isBusted() {
        return scores.score() > 21;
    }

    @Override
    public void addCredit(int amount) {
        this.amount = amount;
        System.out.println("The amount being add is: " + amount);
    }

    @Override
    public int getBet() {
        if (isBlackJack() || isHigher()) {
            return amount;
        }
        return 0;
    }
}
