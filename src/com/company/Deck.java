package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    private String[] faceValue = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//    private int[] faceNumValue = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[] suit = {"♦", "♠", "♣", "♥"};

    public Deck() {
        for (String values : faceValue) {
            for (String suits : suit) {
                cards.add(new Card(values, suits));
            }
        }
        Collections.shuffle(cards);
    }

    public void deal() {
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i).getFaceValue()+ " " + cards.get(i).getSuit());
        }
    }

}
