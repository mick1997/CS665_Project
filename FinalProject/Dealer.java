package FinalProject;

public class Dealer implements HandleTask {

    private static Dealer instance = new Dealer();

    private Dealer() {}

    public static Dealer getInstance() {
        if (instance == null) {
            return new Dealer();
        }
        return instance;
    }

    @Override
    public void receiveBits(int amounts) {

    }

    @Override
    public Card getCard(Card card) {
        return null;
    }
}
