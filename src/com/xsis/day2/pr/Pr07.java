package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB = 0, inputC = 0;
        System.out.print("input A : ");
        inputA = in.nextInt();
        System.out.print("input B : ");
        inputB = in.nextInt();
        System.out.print("input C : ");
        inputC = in.nextInt();

        if ((Math.pow(inputA, 2) + Math.pow(inputB, 2)) == Math.pow(inputC, 2) ||
                (Math.pow(inputC, 2) - Math.pow(inputA, 2) == Math.pow(inputB, 2)) ||
                (Math.pow(inputC, 2) - Math.pow(inputB, 2) == Math.pow(inputA, 2))){
            System.out.println("Right-angled triangle");
        }else{
            System.out.println("Not Right-angled triangle");
        }
    }
}
