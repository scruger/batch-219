package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Input A : ");
        a = in.nextInt();
        System.out.print("Input B : ");
        b = in.nextInt();
        System.out.print("input C : ");
        c = in.nextInt();
        System.out.print("input D : ");
        d = in.nextInt();
        System.out.println("======================");

        if (a >=0 && b>=0 && c>=0 && d>=0 ){
            System.out.println("All The Number Positive");
        }else{
            System.out.println("Among the given numbers, there is a negative one!");
        }
    }
}
