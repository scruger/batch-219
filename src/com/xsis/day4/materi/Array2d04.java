package com.xsis.day4.materi;

public class Array2d04 {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    arr[i][j] = -1;
                }else if (i > j){
                    arr[i][j] = 10;
                }else{
                    arr[i][j] = 20;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
