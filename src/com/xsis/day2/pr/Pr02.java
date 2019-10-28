package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB = 0;
        System.out.print("input A : ");
        inputA = in.nextInt();
        System.out.print("input B : ");
        inputB = in.nextInt();

        if (((inputA % 6) == 0 || (inputB % 7) == 0) && (inputA != 0 && inputB !=0)){
            System.out.println("Bilangan merupakan kelipatan 6 atau kelipatan 7");
        }else {
            System.out.println("Bilangan bukan merupakan kelipatan 6 atau kelipatan 7");
        }
    }
}
