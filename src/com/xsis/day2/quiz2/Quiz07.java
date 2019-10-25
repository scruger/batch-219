package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double avg;
        System.out.print("input Temperature A : ");
        a = in.nextInt();
        System.out.print("input Temperature B : ");
        b = in.nextInt();
        System.out.print("Input Temperature C : ");
        c = in.nextInt();
        System.out.println("======================");

        avg = (a+b+c) /3;
        if (avg > 60){
            System.out.println("Heat Wave");
        }{
            System.out.println("Normal Heat");
        }
    }
}
