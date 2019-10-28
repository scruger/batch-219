package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        double liter = 0, gallon = 0, calculate = 0;
        System.out.println("1. Gallons to liters");
        System.out.println("2. Litters to gallons");
        System.out.print("Enter choice : ");
        input = in.nextInt();

        switch (input){
            case 1:
                System.out.println("\n1. Gallons to liters");
                System.out.print("input gallons : ");
                gallon = in.nextInt();
                calculate = gallon * 3.785;
                System.out.println(gallon + " gallons = " + calculate + " liters");
                break;
            case 2:
                System.out.println("\n2. Litters to gallons");
                System.out.print("input liters : ");
                liter = in.nextInt();
                calculate = liter / 3.785d;
                System.out.println(liter + " liters = " + calculate + " galons");
                break;
        }
    }
}
