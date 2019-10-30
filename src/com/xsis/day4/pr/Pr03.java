package com.xsis.day4.pr;

public class Pr03 {
    public static void main(String[] args) {
        int [][] arr = {{14, 10, 55, 11, 90},
                {3, 12, 7, 88, 2},
                {5, 6, 43, 1, 3},
                {11, 55, 123, 15, 4},
                {15, 55, 67, 18, 8}};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max : " + max);
    }


}
