package com.syntax.replit;

import java.util.*;

public class Replit209 {
    public static void main(String[] args) {
        ArrayList <Map<String, Object>> dataList = new ArrayList<>();

        LinkedHashMap<String, Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        LinkedHashMap<String, Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        double totalPurchase=0;
        for (Map<String, Object> entry:
             dataList) {
            String items=(String) entry.get("Items");
            double price=(double) entry.get("Price");
            int quantity = (Integer)entry.get("Quantity");
            double subtotal=price* (double) quantity;
            System.out.println("Items: "+items+" Price: "+price+" Quantity: "+ (double) quantity +" SubTotal: "+subtotal+"\n");
            totalPurchase+=subtotal;
        }
        System.out.println("Your Purchase total: "+totalPurchase);
    }
}
