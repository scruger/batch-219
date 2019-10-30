package com.xsis.day4.pr;

import java.util.Scanner;

public class Pr02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris , kolom, sum = 0;
        System.out.print("Input Baris : ");
        baris = in.nextInt();
        System.out.print("Input Kolom : ");
        kolom = in.nextInt();

        int[][] arr = new int[baris][kolom];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == ((baris - 1) - j)){
                    arr[i][j] = 5;
                    sum += arr[i][j];
                }else if (i < ((baris -1) - j)){
                    arr[i][j] = 11;
                }else{
                    arr[i][j] = 88;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum : " + sum);
    }
}
