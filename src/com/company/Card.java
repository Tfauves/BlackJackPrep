package com.company;

public class Card {
    public String faceValue;
    public String suit;

    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String card = "\n" + faceValue + "" + suit;
        return card;
    }
}
