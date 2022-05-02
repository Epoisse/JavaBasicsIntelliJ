package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> buildings = new HashMap<>();
        buildings.put(1, "Google");
        buildings.put(2, "Theranos");
        buildings.put(3, "Twitter");
        buildings.put(4, "Theranos");
        buildings.put(5, "Wework");
        buildings.put(7, "Yahoo");
        buildings.put(7, "Google");

        // updating company on a 4th floor
        buildings.put(4, "Syntax");
        // removing entry related to 7th floor
        buildings.remove(7);

        System.out.println(buildings);
    }
}
/*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */