package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kecepatanA = 0, waktuA = 0, kecepatanB = 0, waktuB = 0;
        double jarakTempuhA = 0, jarakTempuhB = 0, calculate = 0;
        System.out.println("=== Mobil A ===");
        System.out.print("Kecepatan : ");
        kecepatanA = in.nextInt();
        System.out.print("Waktu : ");
        waktuA = in.nextInt();

        System.out.println("\n=== Mobil B ===");
        System.out.print("Kecepatan : ");
        kecepatanB = in.nextInt();
        System.out.print("Waktu : ");
        waktuB = in.nextInt();
        System.out.println("\n=================\n");

        jarakTempuhA = 0 + ((kecepatanA * (Math.pow(waktuA, 2))) / 2);
        jarakTempuhB = 0 + ((kecepatanB * (Math.pow(waktuB, 2))) / 2);

        calculate = Math.abs(jarakTempuhA - jarakTempuhB);

        if (jarakTempuhA > jarakTempuhB){
            System.out.println("Car A is First with distance between car B is : " + calculate);
        }else{
            System.out.println("Car B is First with distance between car A is : " + calculate);
        }

    }
}
