package com.xsis.day4.quiz4;

import java.util.Scanner;

public class Quiz01 {

    static void init(int[] n){
        Scanner in = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Input index ke-" + i + " : ");
            input = in.nextInt();
            n[i] = (int)Math.pow(input, 3);
        }
    }

    static void display(int[] n){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] n = new int[5];
        init(n);
        display(n);

    }
}
