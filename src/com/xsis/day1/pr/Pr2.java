package com.xsis.day1.pr;

import java.util.Scanner;

public class Pr2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, reverse = 0, sisa = 0, calculate = 0;
        System.out.print("Input : ");
        input = in.nextInt();

        calculate = input % 10;
        reverse = (reverse * 10) + calculate;
        sisa = input/10;

        calculate = sisa % 10;
        reverse = (reverse * 10) + calculate;
        sisa = sisa/10;

        calculate = sisa % 10;
        reverse = (reverse * 10) + calculate;
        sisa = sisa/10;

        calculate = sisa % 10;
        reverse = (reverse * 10) + calculate;
        sisa = sisa/10;

        calculate = sisa % 10;
        reverse = (reverse * 10) + calculate;

        System.out.println("Reverse : " + reverse);


//        while(input >=1 ){
//            int calculate = input % 10;
//            reverse = (reverse * 10) + calculate;
//            input = input / 10;
//        }
//        System.out.println("Reverse : " + reverse);
    }
}
