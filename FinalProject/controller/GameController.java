package FinalProject.controller;

import FinalProject.card.Card;


public class GameController {

    // Dependencies from external world
    private IGamePolicy gamePolicy;
    private ICardProvider cardProvider;
    private IPlayer dealer;
    private IPlayer[] players;

    public GameController(IGamePolicy gamePolicy, ICardProvider cardProvider, IPlayer dealer, IPlayer[] players) {
        this.gamePolicy = gamePolicy;
        this.cardProvider = cardProvider;
        this.dealer = dealer;
        this.players = players;
    }

    // private fields for internal status
    private boolean gameOver = false;

    public void run() {

        dealInitialHands();
        examineStatus();

        while (!gameOver) {
            performRound();
            examineStatus();
        }
        allocateCredits();
    }

    private void dealInitialHands() {

        dealer.acceptCards(cardProvider.getNext(2));

        for (IPlayer player: players) {
            Card[] twoCards = cardProvider.getNext(2);
            player.acceptCards(twoCards);
        }
    }

    private void performRound() {

        dealer.think();

        if(!dealer.isDone()) {
            dealer.acceptCards(cardProvider.getNext(1));
        }
        for (IPlayer player : players) {
            if(!player.isDone()) {
                player.think();
            }
            if(!player.isDone()){
                player.acceptCards(cardProvider.getNext(1));
            }
        }
    }

    private void examineStatus() {

        boolean dealerIsDone = dealer.isBlackJack() || dealer.isBusted();
        boolean allPlayersDone = true;

        for (IPlayer player: players) {
            if(!player.isDone()) {
                allPlayersDone = false;
                break;
            }
        }
        if(dealerIsDone || allPlayersDone){
            gameOver = true;
        }
    }

    private void allocateCredits() {

        for (IPlayer player : players) {
            boolean playerWin = gamePolicy.isPlayerWin(dealer, player);
            int amount = player.getBet();
            if(playerWin) {
                player.addCredit(amount * 2);
                dealer.addCredit(-amount);
            }
            else{
               dealer.addCredit(amount);
            }
        }
    }

}
