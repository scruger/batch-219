package com.xsis.day1.pr;

import java.util.Scanner;

//min = second = 60
//hour = second = 3600
//day = second  = 86400
//week = second = 604800
public class Pr5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, week = 0, day = 0, hour = 0, minute = 0, second = 0, sisa = 0;
        System.out.print("Input (Second) : ");
        input = in.nextInt();
        week = input / 604800;
        sisa = input % 604800;

        day = sisa / 86400;
        sisa = sisa % 86400;

        hour = sisa / 3600;
        sisa = sisa % 3600;

        minute = sisa / 60;
        sisa = sisa % 60;

        second = sisa;
        sisa = second % 1;

        System.out.println(week+ " weeks " + day + " days " + hour + " hours " + minute + " minutes " + second + " second");

    }
}
