package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int payRate = 0, hours = 0, gross = 0, overTime = 0;
        double deduction = 0, actualPay = 0;
        System.out.print("Pay Rate : ");
        payRate = in.nextInt();
        System.out.print("Hours Worked : ");
        hours = in.nextInt();


        if (hours > 40){
            overTime = (hours - 40) * (payRate * 2);
            gross = (40 * payRate) + overTime;
            deduction = gross * .3;
            actualPay = gross - deduction;
            System.out.println("Gross Pay : " + gross );
            System.out.println("Actual Pay : " + actualPay);
        }else {
            gross = hours * payRate;
            deduction = gross * .3;
            actualPay = gross - deduction;
            System.out.println("Gross Pay : " + gross);
            System.out.println("Actual Pay : " + actualPay);
        }
    }
}
