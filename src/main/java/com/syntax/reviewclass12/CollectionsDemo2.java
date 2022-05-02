package com.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("orsan");
        names.add("Nassir");
        names.add("Mujeeb");
        names.add("tolga");
        /*Iterator<String>iterator=names.iterator();
        while (iterator.hasNext())  {
            if (iterator.next().length()>5){
                iterator.remove();
            }
        }*/
        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()) {
            String name=stringListIterator.next();
            stringListIterator.add("Zulfiya");
        }
        System.out.println(names);
    }
}
