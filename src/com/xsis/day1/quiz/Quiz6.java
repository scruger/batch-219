package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bmi = 0, weight =0, height = 0;
        System.out.print("Masukkan Weight : ");
        weight = in.nextDouble();
        System.out.print("Masukkan Height : ");
        height = in.nextDouble();
        bmi = (weight * 703)/(double)(Math.pow(height,2));
        System.out.println("BMI : " + bmi);
    }
}
