package FinalProject;

public interface GamePolicy {

    boolean isBusted();
    boolean isBlackjack();
    boolean isAce(Card card);
    boolean isFaceCard(Card card);

}
