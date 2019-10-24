package com.xsis.day1;

import java.util.Scanner;

public class Practise10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int input = in.nextInt();

        int sum = 0;
        while (input >=1){
            int calculate = input % 10;
            sum += calculate;
            input = input / 10;
        }
        System.out.println(sum);
    }
}
