package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int payRate = 0, hours = 0, gross = 0, overTime = 0;
        System.out.print("Pay Rate : ");
        payRate = in.nextInt();
        System.out.print("Hours Worked : ");
        hours = in.nextInt();

        if (hours > 40){
            overTime = (hours - 40) * (payRate * 2);
            gross = (40 * payRate) + overTime;
            System.out.println("Gross Pay : " + gross);
        }else {
            gross = hours * payRate;
            System.out.println("Gross Pay : " + gross);
        }

    }
}
