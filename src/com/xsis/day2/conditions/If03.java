package com.xsis.day2.conditions;

import java.util.Scanner;

public class If03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days, month;
        System.out.print("Input Bulan : ");
        month = in.nextInt();

        if (month == 2){
            days = 28;
        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            days = 30;
        }else {
            days = 31;
        }

        System.out.println("days in month " + month + ", has  : " + days);
    }
}
