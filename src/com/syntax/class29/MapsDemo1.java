package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Ashgar Nazir");
        names.add("Nassir");

        System.out.println(names);

        HashMap<Integer, String> map=new HashMap<>();
        map.put(12345,"Asghar Nazir");
        map.put(123456, "Nassir");
        System.out.println(map.get(12345));
        System.out.println(map);
    }
}
