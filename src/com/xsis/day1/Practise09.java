package com.xsis.day1;
import java.util.Scanner;

public class Practise09 {

    public static void main(String[] args) {
        int bilangan, digit1, digit2, digit3, digit4, sisa, totalJumlah;
        Scanner in = new Scanner(System.in);
        System.out.print("Input Bilangan : ");
        bilangan = in.nextInt();

        digit1 = bilangan/1000;
        sisa = bilangan % 1000;
        System.out.println("Digit 1 : " +digit1 + " sisa : " + sisa);

        digit2 = sisa/100;
        sisa = sisa % 100;
        System.out.println("Digit 2 : " + digit2 + " sisa : " + sisa);

        digit3 = sisa / 10;
        sisa = sisa % 10;
        System.out.println("Digit 3 : " + digit3 + " sisa : " + sisa);

        digit4 = sisa;
        sisa = sisa % 1;
        System.out.println("Digit 4 : " + digit4 + " sisa : " + sisa);
        totalJumlah = digit1 + digit2 + digit3 + digit4;
        System.out.println("Total Jumlah : " +totalJumlah);



    }
}
