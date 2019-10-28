package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB = 0, inputC = 0;
        double avg = 0;
        System.out.print("input Jump A : ");
        inputA = in.nextInt();
        System.out.print("input Jump B : ");
        inputB = in.nextInt();
        System.out.print("input Jump C : ");
        inputC = in.nextInt();

        avg = (inputA + inputB + inputC) / 3;
        if (avg > 8){
            System.out.println("Qualified");
        }else{
            System.out.println("Disqualified");
        }
    }
}
