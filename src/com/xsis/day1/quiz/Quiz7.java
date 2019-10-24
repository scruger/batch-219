package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargaProduk1 = 0, hargaProduk2 = 0, hargaProduk3 = 0, totalHargaProduk = 0, totalKenaPajak = 0, rataSebelumPajak = 0,
                rataSesudahPajak = 0;
        System.out.print("Harga Produk 1 : ");
        hargaProduk1 = in.nextDouble();
        System.out.print("Harga Produk 2 : ");
        hargaProduk2 = in.nextDouble();
        System.out.print("Harga Produk 3 : ");
        hargaProduk3 = in.nextDouble();
        totalHargaProduk = hargaProduk1 + hargaProduk2 + hargaProduk3;
        System.out.println("Total Sebelum Kena Pajak : " + totalHargaProduk);
        totalKenaPajak = totalHargaProduk + (totalHargaProduk * .2);
        System.out.println("Total Setelah Kena Pajak : " + totalKenaPajak);
        rataSebelumPajak = totalHargaProduk/3d;
        System.out.println("Rata Rata Sebelum Kena Pajak : " + rataSebelumPajak);
        rataSesudahPajak = totalKenaPajak/3d;
        System.out.println("Rata Rata Setelah Kena Pajak : " + rataSesudahPajak);
    }
}
