package com.xsis.day1;
import java.util.Scanner;

public class Practise03 {



    public static void main(String[] args) {
        // hitung luas persegi panjang
        Scanner scan = new Scanner(System.in);
        int panjang = 0 , lebar = 0, luas = 0;

        System.out.print("Panjang : " );
        panjang = scan.nextInt();
        System.out.print("Lebar : ");
        lebar = scan.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas : " +luas);
    }
}
