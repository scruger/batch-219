package com.xsis.day9.quiz9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Buku {

    static int hariPinjam(int tglMasuk, int bulanMasuk, int tglKeluar, int bulanKeluar){
        LocalDateTime startDate = LocalDateTime.of(2019, bulanMasuk, tglMasuk, 00, 00, 00);
        LocalDateTime endDate = LocalDateTime.of(2019, bulanKeluar, tglKeluar, 00, 00, 00);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        return (int)days;
    }

    static int sewa(int days, int jumlahBuku){
        int biaya = 0;
        for (int i = 1; i <= days; i++) {
            biaya += 5000;
        }
        return biaya * jumlahBuku;
    }

    static int denda(int days, int jumlahBuku){
        int denda = 0;
        for (int i = 1; i <= days; i++) {
            if (i > 3){
                denda += 550;
            }
        }
        return denda & jumlahBuku;
    }

    static double diskonMember(int totalSewa){
        return  totalSewa * .1;
    }

    static double cashBack(int totalSewa){
            return totalSewa * .05;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBuku = 0, tglMasuk = 0, bulanMasuk = 0, tglKeluar = 0, bulanKeluar = 0, diskon = 0, hariPinjam = 0,
        biaya = 0, denda = 0, cashBack = 0, totalTagihan = 0;
        String isMember = "";
        System.out.print("Apakah Member ? Y/N ");
        isMember = in.next().toUpperCase();
        if (isMember.equals("Y")){
            System.out.print("Jumlah Buku : ");
            jumlahBuku = in.nextInt();
            System.out.println("----- Pinjam -----");
            System.out.print("Tanggal Masuk : ");
            tglMasuk = in.nextInt();
            System.out.print("Bulan Masuk : ");
            bulanMasuk = in.nextInt();
            System.out.println("----- Kembali -----");
            System.out.print("Tanggal Keluar : ");
            tglKeluar = in.nextInt();
            System.out.print("Bulan Keluar : ");
            bulanKeluar = in.nextInt();

            hariPinjam = hariPinjam(tglMasuk, bulanMasuk, tglKeluar, bulanKeluar);
            System.out.println("----- Pembayaran Member -----");
            System.out.println("Hari Pinjam : " + hariPinjam);

            biaya = sewa(hariPinjam, jumlahBuku);
            System.out.println("Tagihan \t\t: " + biaya);

            if (hariPinjam > 3){
                denda = denda(hariPinjam, jumlahBuku);
                System.out.println("Denda \t\t\t: " + denda);
            }

            diskon = (int)diskonMember(biaya);
            System.out.println("Diskon Member \t: " + diskon);

            totalTagihan = biaya + denda - diskon;
            System.out.println("Total Tagihan \t: " + totalTagihan);

            if (jumlahBuku > 5){
                cashBack = (int)cashBack(biaya);
                System.out.println("Cash Back \t\t: " + cashBack);
            }
        }else{
            System.out.print("Jumlah Buku : ");
            jumlahBuku = in.nextInt();
            System.out.println("----- Pinjam -----");
            System.out.print("Tanggal Masuk : ");
            tglMasuk = in.nextInt();
            System.out.print("Bulan Masuk : ");
            bulanMasuk = in.nextInt();
            System.out.println("----- Kembali -----");
            System.out.print("Tanggal Keluar : ");
            tglKeluar = in.nextInt();
            System.out.print("Bulan Keluar : ");
            bulanKeluar = in.nextInt();

            hariPinjam = hariPinjam(tglMasuk, bulanMasuk, tglKeluar, bulanKeluar);
            System.out.println("----- Pembayaran -----");
            System.out.println("Hari Pinjam : " + hariPinjam);

            biaya = sewa(hariPinjam, jumlahBuku);
            System.out.println("Tagihan \t\t: " + biaya);

            if (hariPinjam > 3){
                denda = denda(hariPinjam, jumlahBuku);
                System.out.println("Denda \t\t\t: " + denda);
                totalTagihan = biaya + denda;
                System.out.println("Total Tagihan \t: " + totalTagihan);
            }

            if (jumlahBuku > 5){
                cashBack = (int)cashBack(biaya);
                System.out.println("Cash Back \t\t: " + cashBack);
            }
        }
    }
}
