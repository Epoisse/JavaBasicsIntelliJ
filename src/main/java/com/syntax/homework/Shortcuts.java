package com.syntax.homework;


import java.util.ArrayList;
import java.util.Iterator;

public class Shortcuts {

    public static void main(String[] args) {

        // SHIFT+ENTER (Start New Line)
        System.out.println("some text");


        // CMD+SHIFT+ENTER (macOS), or Ctrl+Shift+Enter (Windows) (Complete statement)

        int a = 19;
        if (a > 0) {
            String str = "a;lsfjdl;";
            str.equalsIgnoreCase("sfjlksjfl");
        }
        String str = "string";
        str.equalsIgnoreCase("some str");

        // ALT+ENTER (can fix the errors)

        ArrayList<Card> cards = new ArrayList<>();

        // FN+F2 (macOS), or F2 (Windows) (jumping to the next error or warning)

        cards.add(new TravelCard("TravelCard"));
        cards.add(new GroceryCard("GroceryCard"));
        cards.add(new CashbackCard("CashbackCard"));
        cards.add(new CashbackCard("CashbackCard"));

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).applyDiscount();
            cards.get(i).getInterest();
            cards.get(i).returnCashback();
            cards.get(i).linkDebitAccount();
            cards.get(i).showBalance();

        }
        System.out.println("----------------------------------");

        for (Card card : cards) {
            card.applyDiscount();
        }

        // OPTION+↑ (macOS), or Ctrl+W/Ctrl+Shift+W (Windows) (Extend selection)
        // CMD+D (Copy and paste)

        // OPTION+CMD+L (macOS), or Ctrl+Alt+L (Windows) (Formatting the code)

        // CTR+SHIFT+R (Run the code)


    }
}
