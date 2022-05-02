package com.syntax.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class CardTask {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new TravelCard("TravelCard"));
        cards.add(new GroceryCard("GroceryCard"));
        cards.add(new CashbackCard("CashbackCard"));

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).applyDiscount();
            cards.get(i).getInterest();
            cards.get(i).returnCashback();
            cards.get(i).linkDebitAccount();
            cards.get(i).showBalance();
        }
        System.out.println("----------------------------------");
        for (Card c : cards
        ) {
            c.applyDiscount();
            c.getInterest();
            c.returnCashback();
            c.linkDebitAccount();
            c.showBalance();
        }
        System.out.println("----------------------------------");
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            iterator.next().applyDiscount();
        }
    }
}

abstract class Card {
    String cardName;
    String creditCardType;

    public Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    abstract void returnCashback();

    abstract void getInterest();

    abstract void applyDiscount();

    void showBalance() {
        System.out.println("Any card is showing card balance");
    }

    void linkDebitAccount() {
        System.out.println("Any card is linking debit account");
    }
}

class TravelCard extends Card {
    final String cardName = "Travel card";

    public TravelCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void returnCashback() {
        System.out.println(cardName + " is returning cashback in miles");
    }

    @Override
    void getInterest() {
        System.out.println(cardName + " is collecting interest APR 23%");
    }

    @Override
    void applyDiscount() {
        System.out.println(cardName + " is applying discount for travel 5%");
    }
}

class GroceryCard extends Card {
    final String cardName = "Grocery card";

    public GroceryCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void returnCashback() {
        System.out.println(cardName + " is returning cashback in points");
    }

    @Override
    void getInterest() {
        System.out.println(cardName + " is collecting interest APR 25%");
    }

    @Override
    void applyDiscount() {
        System.out.println(cardName + " is applying discount for grocery 3%");
    }
}

class CashbackCard extends Card {

    final String cardName = "Reward card";

    public CashbackCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void returnCashback() {
        System.out.println(cardName + " is returning cashback in cash");
    }

    @Override
    void getInterest() {
        System.out.println(cardName + " is collecting interest APR 22%");
    }

    @Override
    void applyDiscount() {
        System.out.println(cardName + " is applying discount for every purchase 2%");
    }
}
