package com.xsis.day4.pr;

import java.util.Scanner;

public class prdini06 {
    static final double ongkir = 5000;
    public static void main(String[] args) {
        boolean ulang = true;
        char cek;
        int input, pilih, member;
        double weight, biaya, biayapilihan=0, total=0, bayar, kembali;
        Scanner scan = new Scanner(System.in);
            while (ulang){
                System.out.print("Input weight: ");
                weight = scan.nextDouble();
                if(weight%1<.3){
                    weight = Math.floor(weight);
                } else{
                    weight = Math.ceil(weight);
                }
                biaya = weight*ongkir;
                System.out.println("Pilih tujuan anda: ");
                System.out.println("1. Dalam Kota");
                System.out.println("2. Luar Kota Dalam Pulau");
                System.out.println("3. Luar Kota Luar Pulau");
                System.out.println("0. Keluar");
                System.out.print("Masukkan pilihan anda: ");
                pilih = scan.nextInt();
                switch (pilih){
                    case 1:
                        biayapilihan = 2000 + biaya;
                        break;
                    case 2:
                        biayapilihan = 10000 + biaya;
                        break;
                    case 3:
                        biayapilihan = 50000 + biaya;
                        break;
                    default:
                        System.out.println("Yang anda masukkan tidak sesuai");
                }

                total = total+biayapilihan;
                System.out.print("Pilihan: ");
                System.out.println("1. Member");
                System.out.println("2. Bukan");
                member = scan.nextInt();
                switch (member){
                    case 1:
                        if(total>=200000){
                            total = total - 15000;
                        }
                        break;
                    case 2:
                        System.out.println("Maaf tak ada biaya potongan");
                        break;
                    default:
                        break;
                }
                System.out.println("Biaya: "+total);
                System.out.print("Bayar: ");
                bayar = scan.nextDouble();
                kembali = bayar - total;
                System.out.println("Kembali uang Anda adalah: "+kembali);
                System.out.println("Apakah ingin mengirim paket lagi? (y/t)");
                cek = scan.next().charAt(0);
                if(cek=='y'){
                    ulang = true;
                } else if(cek=='t'){
                    ulang = false;
                }
            }
    }
}
