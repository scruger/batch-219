package com.xsis.day1.pr;

import java.util.Scanner;

public class Pr7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, mile = 0, yard = 0, foot = 0, inch = 0, sisa = 0;
        System.out.print("Input (inches) : ");
        input = in.nextInt();
        mile = input / 63360;
        sisa = input % 63360;

        yard = sisa / 36;
        sisa = sisa % 36;

        foot = sisa / 12;
        sisa = sisa % 12;

        inch = sisa ;
        sisa = sisa % 1;

        System.out.println(mile+ " Mile " + yard + " Yards " +  foot + " Feet " + inch + " inches");

    }
}
