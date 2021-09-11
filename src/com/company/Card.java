package com.company;

public class Card {
    private String faceValue;
    private String suit;

    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public String getSuit() {
        return suit;
    }
}
