package com.xsis.day1;


//calculate tax per item

import java.util.Scanner;

public class Practise06 {

    static final double tax = .15;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemBeforeTax = 0, itemAftertax = 0;

        System.out.print("Harga Barang sebelum pajak : ");
        itemBeforeTax = scan.nextDouble();

        itemAftertax = itemBeforeTax - (itemBeforeTax * tax);
        System.out.print("Harga Barang setelah pajak : " + itemAftertax);
    }

}
