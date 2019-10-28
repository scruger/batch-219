package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int random = 0;
        System.out.print("Input Grade : ");
        input = in.nextLine().toUpperCase();

        switch (input){
            case "A":
                random =     90 + (int)(Math.random() * 10);
                System.out.println("Percentage A (90 - 100) : " + random);
                break;
            case "B":
                random = 80 + (int)(Math.random() * 9);
                System.out.println("Percentage B (80 - 89) : " + random);
                break;
            case "C":
                random = 70 + (int)(Math.random() * 9);
                System.out.println("Percentage C (70 - 79) : " + random);
                break;
            case "D":
                random = 60 + (int)(Math.random() * 9);
                System.out.println("Percentage D (60 - 69) : " + random);
                break;
            case "E":
            case "F":
                random = (int)(Math.random() * 59);
                System.out.println("Percentage E / F (0 - 59) : " + random);
                break;
            default:
                System.out.println("Wrong Input Grade");
        }
    }
}
