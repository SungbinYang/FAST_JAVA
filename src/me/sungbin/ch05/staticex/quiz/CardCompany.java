package me.sungbin.ch05.staticex.quiz;

public class CardCompany {

    public static CardCompany cardCompany = new CardCompany();

    private CardCompany() {

    }

    public static CardCompany getInstance() {

        if (cardCompany == null) {
            cardCompany = new CardCompany();
        }
        return cardCompany;
    }

    public Card createCard() {
        Card card = new Card();
        return card;
    }
}
