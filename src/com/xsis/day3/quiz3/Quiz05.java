package com.xsis.day3.quiz3;

import java.util.Scanner;

public class Quiz05 {


    public static void main(String[] args) {
        int year = 1, population;
        double expand;
        population = 30000;

        while (population <= 100000){
            expand = population * .03;
            population += expand;
            year++;
        }
        System.out.println("Expanding population 30000 to 100000 takes : " + year + " years");
    }
}
