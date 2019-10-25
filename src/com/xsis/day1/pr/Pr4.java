package com.xsis.day1.pr;

import java.util.Scanner;

public class Pr4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, result = 0;
        System.out.print("Input : ");
        input = in.nextInt();
        result = (input + 1) % 2;
        System.out.println("Result : " + result);
    }
}
