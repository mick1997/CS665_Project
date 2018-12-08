package FinalProject;

public class Player implements HandleTask {

    private int numOfPlayers;
    private int numOfBits;

    private static Player instance = new Player();

    private Player() {}

    public static Player getInstance() {
        if (instance == null) {
            return new Player();
        }
        return instance;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public void placeBits(int numOfBets) {
        this.numOfBits = numOfBets;
    }

    @Override
    public void receiveBits(int amounts) {

    }

    @Override
    public Card getCard(Card card) {
        return null;
    }
}
