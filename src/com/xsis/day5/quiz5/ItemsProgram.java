package com.xsis.day5.quiz5;

import java.util.Scanner;

public class ItemsProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihMenu = "", checkChart = "";
        int searchKode = 0, harga = 0, bayar = 0, kembalian = 0, indexList = 0, totalHarga = 0, qty = 0;

        Items item1 = new Items(123, "Shirt ", 350000);
        Items item2 = new Items(456, "Pants", 200000);
        Items item3 = new Items(777, "Shoes", 300000);
        Items item4 = new Items(981, "Glasses", 400000);

        Items[] item = {item1, item2, item3, item4};
        Items[] list = new Items[5];

        System.out.println("====== Cash Register ======");

        do{
            System.out.println("\nPilih menu : ");
            System.out.println("Q-> Quit, 1-> Show Barang, 2-> Belanja, 3-> Show Chart, 4-> Bayar");
            pilihMenu = in.next().toUpperCase();
            switch (pilihMenu){
                case "Q":
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("========== Show Barang ==========");
                    System.out.println("Kode\tName\t\tHarga");
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(item[i].showBarang());
                    }
                    break;
                case "2":
                    do{
                        System.out.println("========== Belanja ==========");
                        System.out.print("Search by Kode Item : ");
                        searchKode = in.nextInt();
                        System.out.println("Kode\tName\t\tHarga");
                        for (int i = 0; i < item.length; i++) {
                            if(item[i].getKodeItem() == searchKode) {
                                System.out.println(item[i].showBarang());
                                System.out.print("\nAdd to Chart? Y/N ");
                                checkChart = in.next().toUpperCase();
                                System.out.print("Input Qty : ");
                                qty = in.nextInt();
                                item[i].setQty(qty);
                                System.out.println("=== Item Added to Chart ===");
                                if (checkChart.equals("Y")){
                                    list[indexList] = item[i];
                                    indexList++;
                                }else{
                                    System.out.println("\nSilahkan Pilih Barang Kembali\n");
                                }
                            }
                        }
                    }while (checkChart.equals("N"));
                    break;
                case "3":
                    System.out.println("========== Show Chart ==========");
                    System.out.println("Kode\tName\t\tHarga\t\t\tQty");
                    for (int i = 0; i < list.length; i++) {
                        if (list[i] != null){
                            System.out.println(list[i].showChart());
                        }else{
                            System.out.print("");
                        }
                    }
                    break;
                case "4":
                    System.out.println("========== Bayar ==========");
                    System.out.println("Kode\tName\t\tHarga\t\t\tQty\t\tTotal Harga");
                    for (int i = 0; i < list.length; i++) {
                        if (list[i] != null){
                            harga = list[i].getHarga() * list[i].getQty();
                            totalHarga += harga;
                            System.out.println(list[i].showChart() + "\t\tRp. " + harga);
                        }else{
                            System.out.print("");
                        }
                    }
                    System.out.println("\nTotal Harga Semua: Rp. " + totalHarga);
                    System.out.print("Masukkan Uang : Rp. ");
                    bayar = in.nextInt();
                    kembalian = bayar - totalHarga;
                    System.out.println("Kembalian : Rp. " + kembalian);
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }while (!pilihMenu.equals("Q") && !pilihMenu.equals("4"));


    }
}
