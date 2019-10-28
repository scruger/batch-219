package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double input = 0, calculate;
        int conv = 0, sisa = 0;
        System.out.print("input : ");
        input = in.nextDouble();

        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven" , "eight", "nine"};
        calculate = input * 10;

        conv = (int)calculate / 10;
        sisa = (int)calculate % 10;
        
        System.out.println(words[conv] + " point " + words[sisa]);




    }
}
