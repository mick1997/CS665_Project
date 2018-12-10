package FinalProject.controller;

import FinalProject.card.Card;
import FinalProject.card.Hand;

import java.util.ArrayList;
import java.util.List;

public class ScoreAdjust extends Hand {

    public int score() {

        List<Integer> scores = possibleScores();
        int maxUnder = Integer.MIN_VALUE; // max score <= 21
        int minOver = Integer.MAX_VALUE; // min score > 21

        for (int score : scores) {
            if (score > 21 && score < minOver) {
                minOver = score;
            }
            else if (score <= 21 && score > maxUnder) {
                maxUnder = score;
            }
        }

        if (maxUnder == Integer.MIN_VALUE) {
            return minOver;
        }
        else {
            return maxUnder;
        }
    }

    private List<Integer> possibleScores() {

        List<Integer> scores = new ArrayList<>();

        for (Card card : cards) {
            updateScores(card, scores);
        }
        return scores;
    }

    private void updateScores(Card card, List<Integer> scores) {

        final int[] toAdd = getScores(card);

        if (scores.isEmpty()) {
            for (int score : toAdd) {
                scores.add(score);
            }
        }
        else {
            final int length = scores.size();
            for (int i = 0; i < length; i++) {
                int oldScore = scores.get(i);
                scores.set(i, oldScore + toAdd[0]);
                for (int j = 1; j < toAdd.length; j++) {
                    scores.add(oldScore + toAdd[j]);
                }
            }
        }
    }

    private int[] getScores(Card card) {
        if (card.getFaceValue() > 1) { // regular card 1 - 13
            return new int[]{Math.min(card.getFaceValue(), 10)};
        }
        else { // Ace
            return new int[]{1, 11};
        }
    }

//    @Override
//    public boolean isBusted() {
//        return score() > 21;
//    }
//
//    @Override
//    public boolean isBlackjack() {
//
//        if (cards.size() != 2) {
//            return false;
//        }
//
//        Card first = cards.get(0);
//        Card second = cards.get(1);
//        return (isAce(first) && isFaceCard(second)) || (isAce(second) && isFaceCard(first));
//    }
//
//    @Override
//    public boolean isAce(Card card) {
//        return card.getFaceValue() == 1;
//    }
//
//    @Override
//    public boolean isFaceCard(Card card) {
//        return card.getFaceValue() >= 11 && card.getFaceValue() <= 13;
//    }
}
