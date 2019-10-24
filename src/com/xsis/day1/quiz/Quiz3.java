package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz3 {

    static final double pajak = .07;
    static final double tips = .1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargaOrder = 0, totalTagihan = 0;
        System.out.print("Harga Order Makanan : ");
        hargaOrder = in.nextDouble();
        totalTagihan = hargaOrder + (hargaOrder * pajak) + (hargaOrder * tips);
        System.out.println("Total Tagihan Makanan : " + totalTagihan);

    }
}
