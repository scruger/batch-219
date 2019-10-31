package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB = 0, hitung = 0;
        System.out.print("Kertas A : ");
        inputA = in.nextInt();
        System.out.print("Kertas B : ");
        inputB = in.nextInt();

        hitung = (int)(Math.pow(2, (inputB - inputA)));
        System.out.println("Kertas A" + inputA + " = " + hitung + " x Kertas A" + inputB);
    }
}
