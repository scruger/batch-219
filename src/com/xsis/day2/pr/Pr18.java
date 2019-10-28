package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.print("input number of CD purchased : ");
        input = in.nextInt();

        if (input <= 0){
            System.exit(0);
        }

        switch (input){
            case 1:
                System.out.println("Customer awarded 3 points");
                break;
            case 2:
                System.out.println("Customer awarded 10 points");
                break;
            case 3:
                System.out.println("Customer awarded 20 points");
                break;
            default:
                System.out.println("Customer awarded 45 points");
        }
    }
}
