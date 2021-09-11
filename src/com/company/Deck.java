package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> cards = new ArrayList<>();
    public String[] faceValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public String[] suit = {"Diamond", "Spade", "Club", "Heart"};

    public Deck() {
        for (String values : faceValue) {
            for (String suits : suit) {
                this.cards.add(new Card(values, suits));
            }
        }
        Collections.shuffle(this.cards);
    }

    public void deal(List<Card> deck) {
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i).faceValue + " " + cards.get(i).suit);
        }
    }

}
