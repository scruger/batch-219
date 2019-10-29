package com.xsis.day4.quiz4;

import java.util.Scanner;

public class Quiz07 {

    static void init(int[] n){
        Scanner in = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input index ke-" + i + " : ");
            input = in.nextInt();
            n[i] = input;
        }
    }

    static void displaySumPositive(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 0) {
                sum += n[i];
                System.out.print(n[i] + " ");
            }
        }
        System.out.println("\nSum Positive : " + sum + "\n");
    }

    static void displaySumNegative(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                sum += n[i];
                System.out.print(n[i] + " ");
            }
        }
        System.out.println("\nSum Negative : " + sum);
    }

    public static void main(String[] args) {
        int[] n = new int[5];
        init(n);
        displaySumPositive(n);
        displaySumNegative(n);

    }
}
