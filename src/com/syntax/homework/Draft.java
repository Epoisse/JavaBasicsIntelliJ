package com.syntax.homework;

import java.util.Arrays;

class Lol {

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7,8},
                {1,3,5,7}
        };
        reduce10(a);
        //print the elements from new array
        int[][]result=reduce10(a);
        for(int[]r:result){
            for(int c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static int[][] reduce10(int[][]array){
//find length of each row dynamically
        int[]eachRlength=new int[array.length];
        for(int i=0; i< array.length; i++) {
            eachRlength[i]=array[i].length;
        }
        Arrays.sort(eachRlength);
//fill new array with elements from pass array -10
        int [][] arrayR=new int[array.length][eachRlength[eachRlength.length-1]];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                arrayR[i][j]=array[i][j]-10;
            }
        }
        return arrayR;
    }
}



