package com.xsis.day4.quiz4;

import java.util.Scanner;

public class Quiz08 {

    static void init(int[] n){
        Scanner in = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input index ke-" + i + " : ");
            input = in.nextInt();
            n[i] = input;
        }
    }

    static void displayAvg(int[] n){
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            System.out.print(n[i] + " ");
        }
        avg = sum / n.length;
        System.out.println("\nAverage : " + avg);
    }

    public static void main(String[] args) {
        int[] n = new int[5];
        init(n);
        displayAvg(n);
    }
}
