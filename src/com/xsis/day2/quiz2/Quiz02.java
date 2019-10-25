package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB =0;
        System.out.print("Input A : ");
        inputA = in.nextInt();
        System.out.print("Input B : ");
        inputB = in.nextInt();
        System.out.println("======================");

        if (inputA >=0 && inputB >=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
