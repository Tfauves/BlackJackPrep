package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> cards = new ArrayList<>();
    public String[] faceValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public String[] suit = {"Diamond", "Spade", "Club", "Heart"};

    public Deck() {
        for (int i = 0; i < faceValue.length; i++) {
            for (int j = 0; j < suit.length; j++ ) {
                this.cards.add(new Card(faceValue[i], suit[j]));
            }
        }
        Collections.shuffle(this.cards);
    }

    public void deal(List<Card> deck) {
        for (Card card : cards) {
            System.out.println(card.faceValue + " " + card.suit);
        }
    }




}
