package com.xsis.day1.quiz;

import java.util.Scanner;

public class Quiz9 {

    static final int kwhHarga = 15000;
    static final double pajak = .2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kwhAwal = 0, kwhAkhir = 0, kwhDikonsumsi = 0, totalTagihan = 0;
        double tagihanSetelahPajak = 0;

        System.out.print("kWh Awal : ");
        kwhAwal = in.nextInt();
        System.out.print("kWh Akhir : ");
        kwhAkhir = in.nextInt();
        kwhDikonsumsi = kwhAkhir - kwhAwal;
        System.out.println("kWh Dikonsumsi ; " + kwhDikonsumsi);
        totalTagihan = kwhDikonsumsi * kwhHarga;
        tagihanSetelahPajak = totalTagihan + (totalTagihan * pajak);
        System.out.println("Total Tagihan Setelah Pajak : " + tagihanSetelahPajak);
    }
}
