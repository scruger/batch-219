package com.xsis.day4.pr;

import java.util.Scanner;

public class Pr06 {

    static final int ongkir = 5000;

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double weight = 0;
        int biaya = 0, totalBiaya = 0, pilih = 0, totalTransaksi = 0, bayar = 0, kembalian = 0;
        String check = "", checkMember = "", checkCash = "";
        boolean isMember = false, isCash = false, isSendAnother = false;

        do {
            System.out.print("input weight : ");
            weight = in.nextDouble();
            if (weight % 1 <= .3) {
                weight = Math.floor(weight);
            }else {
                weight = Math.ceil(weight);
            }

            System.out.println("Pilih tujuan anda: ");
            System.out.println("1. Dalam Kota");
            System.out.println("2. Luar Kota Dalam Pulau");
            System.out.println("3. Luar Kota Luar Pulau");
            System.out.println("0. Tidak Jadi");
            System.out.print("Masukkan pilihan anda: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    biaya = 2000 + ((int)weight * ongkir);
                    break;
                case 2:
                    biaya = 10000 + ((int)weight * ongkir);
                    break;
                case 3:
                    biaya = 50000 + ((int)weight * ongkir);
                    break;
                default:
                    System.out.println("Terimakasih");
                    System.exit(0);
            }
            totalBiaya += biaya;
            totalTransaksi += totalBiaya;
            System.out.println("Total Biaya Pada Transaksi saat ini : " + totalBiaya);
            System.out.println("Total Biaya Pada Keseluruhan Transaksi : " + totalTransaksi);
            System.out.print("ingin menambah barang kembali ? Y/T ");
            check = in.next().toUpperCase();

        }while (check.equals("Y"));

        System.out.print("\nApakah Member ? Y/T ");
        checkMember = in.next().toUpperCase();

        if (checkMember.equals("Y")){
            if (totalTransaksi >= 200000){
                totalTransaksi = totalTransaksi - 15000;
                System.out.println("Get Cash Back Rp. 15.000");
            }else {
                System.out.println("Pembelian kurang dari Rp. 200.000");
            }
        }else{
            System.out.println("Maaf anda tidak mendapatkan cash back");
        }

        System.out.print("\nApakah Pembayaran Cash? Y/T ");
        checkCash = in.next().toUpperCase();

        if (checkCash.equals("Y")){
            System.out.print("Input Amount : ");
            bayar = in.nextInt();
            kembalian = bayar - totalTransaksi;
            System.out.println("\nKembalian anda adalah : " + bayar +  " - " + totalTransaksi + " = " + kembalian);
        }else {
            System.out.println("Pembayaran Non Tunai");
        }

        System.out.println("\nTerimakasih Telah Mengirim Paket Melalui Jasa Kami");



    }
}
