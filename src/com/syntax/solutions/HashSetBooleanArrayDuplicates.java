package com.syntax.solutions;

import java.util.HashSet;
import java.util.Set;

public class HashSetBooleanArrayDuplicates {
    boolean duplicates(final int[] zipcodelist)
    {
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : zipcodelist)
        {
            if (lump.contains(i)) return true;
            lump.add(i);
        }
        return false;
    }
  static int duplicatesCount(final int[] zipcodelist)
    {
        int counter=0;
        Set<Integer> lump = new HashSet<Integer>();
        for (int i : zipcodelist)
        {
            if (lump.contains(i)){
             counter++;
            }
            lump.add(i);
        }
        return counter;
    }


    public static void main(String[] args) {
        int[] numbers = new int[]{7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1};
        System.out.println(duplicatesCount(numbers));
    }
}
