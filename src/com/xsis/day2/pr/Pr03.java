package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, quotient = 0, remainder = 0;
        System.out.print("input : ");
        input = in.nextInt();

        quotient = input / 4;
        remainder = input % 4;
        if ((input % 4) == 0){
            System.out.println(input + " = " + quotient + " x 4 ");
        }else {
            System.out.println(input + " = " + quotient + " x 4 + " + remainder);
        }
    }
}
