package com.xsis.day4.materi;

import java.util.Scanner;

public class Array2d03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] a = new int[2][3];

        //initial value untuk tiap row, kolom
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Input Number index " + i + " " + j + " : ");
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }

        //show list array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
