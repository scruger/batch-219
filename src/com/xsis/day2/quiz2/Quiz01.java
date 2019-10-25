package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input : ");
        int input = in.nextInt();
        System.out.println("======================");

        if (input >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
