package FinalProject;


public class GameController {

    private Deck deck;
    private Hand hand;
    private static final int HIT_UNTIL = 17;

    public GameController() {

        Player player = Player.getInstance();
        player.setNumOfPlayers(2);
        Player.getInstance().placeBits(10);

        Dealer dealer = Dealer.getInstance();

    }

    private void initializeGame() {
        deck = new Deck(1);
        deck.shuffle();
    }



}
