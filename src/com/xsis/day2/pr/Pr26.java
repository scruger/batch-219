package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kwh = 0;
        double total = 0;
        System.out.print("Enter number of Killowatt-hours consumed : ");
        kwh = in.nextInt();

        if (kwh <= 500){
            total = kwh * .1;
            System.out.println("Total amount to pay : " + total);
        }else if (kwh > 500 && kwh <= 2000){
            total = kwh * .25;
            System.out.println("Total amount to pay : " + total);
        }else if (kwh > 2000 && kwh <= 4000){
            total = kwh * .4;
            System.out.println("Total amount to pay : " + total);
        }else if (kwh > 4000){
            total = kwh * .6;
            System.out.println("Total amount to pay : " + total);
        }

    }
}
