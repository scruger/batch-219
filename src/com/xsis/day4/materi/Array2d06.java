package com.xsis.day4.materi;

import java.util.Scanner;

public class Array2d06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int baris , kolom;
        System.out.print("Input Baris : ");
        baris = in.nextInt();
        System.out.print("Input Kolom : ");
        kolom = in.nextInt();

        int[][] arr = new int[baris][kolom];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == (arr.length-1) /2){
                    arr[i][j] = -1;
                }else if (i < ((arr.length -1) /2)){
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
