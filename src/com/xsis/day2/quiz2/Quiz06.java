package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, temp;
        System.out.print("input A :");
        a = in.nextInt();
        System.out.print("input B : ");
        b = in.nextInt();
        System.out.println("======================");

        if(a > b) {
            System.out.println("A : " + a);
            System.out.println("B : " + b);
        }else{
            temp = a;
            a = b;
            b = temp;
            System.out.println("A : " + a);
            System.out.println("B : " + b);
        }
    }
}
