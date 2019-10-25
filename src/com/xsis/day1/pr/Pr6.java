package com.xsis.day1.pr;

import java.util.Scanner;

public class Pr6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, notes20 = 0, notes10 =0, notes5 = 0, notes1 = 0, sisa = 0;
        System.out.print("Input : ");
        input = in.nextInt();

        notes20 = input / 20;
        sisa = input % 20;

        notes10 = sisa / 10;
        sisa = sisa % 10;

        notes5 = sisa / 5;
        sisa = sisa % 5;

        notes1 = sisa ;
        sisa = sisa % 1;

        System.out.println(notes20+ " notes of $20 " + notes10 + " note of $10 " + notes5 + " note of $5 " + notes1 + " notes of $1");

    }
}
