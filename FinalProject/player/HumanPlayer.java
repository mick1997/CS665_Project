package FinalProject.player;

import FinalProject.card.Card;
import FinalProject.controller.ICardProvider;
import FinalProject.controller.IGamePolicy;
import FinalProject.controller.IPlayer;
import FinalProject.controller.ScoreAdjust;

import java.util.Arrays;

public class HumanPlayer extends Player implements IPlayer, ICardProvider, IGamePolicy {

    private ScoreAdjust scores;
    private Card card;
    private int amount;
    private static HumanPlayer instance = new HumanPlayer();

    private HumanPlayer() {}

    public HumanPlayer getInstance() {
        if (instance == null) {
            return new HumanPlayer();
        }
        return instance;
    }

    @Override
    public void acceptCards(Card[] newCards) {
        System.out.println("The card received are: " + Arrays.toString(newCards));
    }

    @Override
    public void think() {
        System.out.println("thinking ...");

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

    public void placeBet(int amount) {
        this.amount = amount;
        System.out.println("The amount of bets is placed: " + amount);
    }

    @Override
    public int getBet() {
        if (isBlackJack() || isHigher()) {
            return amount;
        }
        return 0;
    }

    @Override
    public void addCredit(int amount) {
        this.amount = amount;
        System.out.println("The amount being add is: " + amount);
    }

    @Override
    public boolean isHigher() {

        if (card.getFaceValue() ) {
            return true;
        }
        return false;
    }

    @Override
    public Card[] getNext(int count) {
        if (count == 0) {
            return new Card[0];
        }
        return new Card[0];
    }

    @Override
    public boolean isPlayerWin(IPlayer dealer, IPlayer player) {
        return player.isBlackJack() || player.isHigher();
    }
}
