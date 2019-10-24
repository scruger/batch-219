package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargaBarang = 0, diskon = 0, hemat = 0;
        System.out.print("Harga Barang : ");
        hargaBarang = in.nextDouble();
        System.out.print("Diskon : ");
        diskon = in.nextDouble();
        hemat = hargaBarang/(double)(diskon/100);
        System.out.print("Anda Hemat : " + hemat);
    }
}
