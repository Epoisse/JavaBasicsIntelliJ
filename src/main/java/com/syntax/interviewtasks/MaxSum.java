package com.syntax.interviewtasks;

import java.util.*;

public class MaxSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(findMaxSum(list));
    }


    /* public static int findMaxSum(List<Integer> list) {
         int temp;
         int sum = 0;
         for (int i = 0; i < list.size(); i++) {
             for (int j = list.size(); j > 1 + i; j--) {
                 if (list.get(j - 1) > list.get(j - 2)) {
                     temp = list.get(j - 1);
                     list.set((j - 1), list.get(j - 2));
                     list.set(j - 2, temp);
                 }
             }
         }
         for (int i = 1; i < list.size(); i++) {
             if (!Objects.equals(list.get(0), list.get(i))) {
                 sum = list.get(0) + list.get(i);
                break;
             }

         }

         return sum;
     }*/
    /*public static int findMaxSum(List<Integer> list) {
        Collections.reverse(list);

        int sum = 0;
        for (int i = 1; i < list.size(); i++) {
            if (!Objects.equals(list.get(0), list.get(i))) {
                sum = list.get(0) + list.get(i);
                break;
            }
        }
        return sum;
    }*/
    public static int findMaxSum(List<Integer> list) {
        int largest = 0;
        int secLargest = 0;
        int sum;
        for (int i = 0; i < list.size(); i++) {
           if (largest<list.get(i)) {
               secLargest=largest;
               largest= list.get(i);
           } else if (secLargest<list.get(i)) {
               secLargest=list.get(i);
           }

        }
        return sum = largest + secLargest;
    }
}



/*
* Write the logic that picks largest and second largest numbers from
* a list add them and return the results. input to method is
* a list that contains the numbers input [10,20,30,40]

output [70]
input[5,3,8,9,10,11,5]
output [21]
* */