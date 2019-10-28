package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        double diskon, calculate;
        System.out.print("amount of the dollar : ");
        input = in.nextInt();

        if (input < 30){
            System.out.println("Total amount " + input);
        }else if (input >= 30 && input < 70){
            diskon = input * .05;
            calculate = input - diskon;
            System.out.println("Total amount " + input + " - discount " + diskon + " = " +calculate);
        }else if (input >= 70 && input < 150) {
            diskon = input * .1;
            calculate = input - diskon;
            System.out.println("Total amount " + input + " - discount " + diskon + " = " + calculate);
        }else if (input >150) {
            diskon = input * .2;
            calculate = input - diskon;
            System.out.println("Total amount " + input + " - discount " + diskon + " = " + calculate);
        }else{
            System.out.println("Wrong input");
        }
    }
}
