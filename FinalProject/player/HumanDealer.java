package FinalProject.player;

import FinalProject.card.Card;
import FinalProject.controller.ICardProvider;
import FinalProject.controller.IGamePolicy;
import FinalProject.controller.IPlayer;
import FinalProject.controller.ScoreAdjust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanDealer extends Player implements IPlayer, IGamePolicy, ICardProvider {

    private ScoreAdjust scores;
    private Card card;
    private int amount;
    private static HumanDealer instance = new HumanDealer();

    private HumanDealer() {}

    public static HumanDealer getInstance() {
        if (instance == null) {
            return new HumanDealer();
        }
        return instance;
    }

    // getNext ???
    @Override
    public Card[] getNext(int count) {
        List<Card> cards = new ArrayList<>();
        for (Card card : cards) {
            return
        }
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

    // higher ???
    @Override
    public boolean isHigher() {
        return false;
    }
}
