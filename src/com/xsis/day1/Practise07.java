package com.xsis.day1;

import java.util.Scanner;

public class Practise07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemBeforeDiscount = 0, discount = 0, itemAfterDiscount = 0;
        System.out.print("Harga Item Barang : ");
        itemBeforeDiscount = scan.nextDouble();
        System.out.print("Discount : ");
        discount = scan.nextDouble();

        itemAfterDiscount = itemBeforeDiscount - (itemBeforeDiscount * (discount/100));
        System.out.println("Item After Discount ; " + itemAfterDiscount);
    }
}
