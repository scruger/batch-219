package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kecepatan = 0, waktu = 0;
        double jarakTempuh = 0;
        System.out.print("Kecepatan : ");
        kecepatan = in.nextInt();
        System.out.print("Waktu : ");
        waktu = in.nextInt();

        jarakTempuh = 0 + ((kecepatan * (Math.pow(waktu,2)))/2);
        System.out.println("Jarak Tempuh : " +jarakTempuh);
    }
}
