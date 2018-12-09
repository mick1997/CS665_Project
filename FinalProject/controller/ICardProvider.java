package FinalProject.controller;

import FinalProject.card.Card;

public interface ICardProvider {
    Card[] getNext(int count);
}
