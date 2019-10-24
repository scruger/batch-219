package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double farenheit = 0, celcius = 0;
        System.out.print("Farenheit : ");
        farenheit = in.nextInt();
        celcius = (farenheit - 32) * (5d/9d);
        System.out.println("Celcius : " + celcius);
    }
}
