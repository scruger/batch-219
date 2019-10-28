package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = " ";
        System.out.print("Enter type of the vehicle : ");
        input = in.nextLine().toUpperCase();

        switch (input){
            case "M":
                System.out.println("Amount to pay for motorcycle is $1");
                break;
            case "C":
                System.out.println("Amount to pay for car is $2");
                break;
            case "T":
                System.out.println("Amount to pay for truck is $4");
                break;
            default:
                System.out.println("Wrong type");
        }
    }
}
