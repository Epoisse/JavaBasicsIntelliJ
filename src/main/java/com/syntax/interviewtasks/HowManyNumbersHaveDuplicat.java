package com.syntax.interviewtasks;

import java.util.HashSet;
import java.util.List;

public class HowManyNumbersHaveDuplicat {
    static int countDuplicates(List<Integer> numbers) {
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) continue;
                if (numbers.get(i).equals(numbers.get(j))) duplicates.add(numbers.get(i));
            }
        }
        return duplicates.size();
    }
}
/*Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
*/
