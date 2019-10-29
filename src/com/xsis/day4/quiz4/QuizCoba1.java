package com.xsis.day4.quiz4;

import java.util.Scanner;

public class QuizCoba1 {

    static void init(int[] n){
        Scanner in = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input index ke-" + i + " : ");
            input = in.nextInt();
            n[i] = input;
        }

        for (int i = n.length-1; i >= 0; i--) {
            if (n[i] % 5 == 0)
            System.out.print(n[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] n = new int[5];
        init(n);
    }
}
