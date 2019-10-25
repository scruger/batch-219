package com.xsis.day2.math;

import java.util.Scanner;

public class Math02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s = 0, a = 0, t = 0;
        System.out.print("Jarak : ");
        s = in.nextDouble();

        System.out.print("Percepatan : ");
        a = in.nextDouble();

        t = Math.sqrt((2*s)/a);
        System.out.println("Waktu : " + t);
        System.out.println("Waktu : " + Math.round(t));
        System.out.println("Waktu : " + Math.ceil(t));
        System.out.println("Waktu : " + Math.floor(t));
    }
}
