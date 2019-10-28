package com.xsis.day3.forloop;

import java.util.Scanner;

public class For02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.print("Input : ");
        number = in.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("i = " + i);
        }

    }
}
