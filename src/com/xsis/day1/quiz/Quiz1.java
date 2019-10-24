package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz1 {

    static final int totalSudut = 180;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sudut1 = 0, sudut2 = 0, sudut3 = 0;
        System.out.print("Sudut 1 : ");
        sudut1 = in.nextInt();
        System.out.print("Sudut 2 : ");
        sudut2 = in.nextInt();
        sudut3 = totalSudut - (sudut1 + sudut2);
        System.out.println("Sudut 3 : " + sudut3 +" derajat");
    }
}
