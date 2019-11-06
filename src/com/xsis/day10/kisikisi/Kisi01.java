package com.xsis.day10.kisikisi;

import java.util.Scanner;

public class Kisi01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pulsa = 0, point = 0, sisa = 0;
        System.out.print("input pulsa : Rp. ");
        pulsa = in.nextInt();

        if (pulsa >=0 && pulsa <= 10000){
            pulsa = pulsa - 10000;
            point = 0;
            System.out.println(point);
        }
        if (pulsa > 10000 && pulsa <= 30000){
            point += (pulsa/1000);
            System.out.println(point);
            System.out.println(pulsa);
        }
        if (pulsa > 30000){
            point += (pulsa - (pulsa - 20000))/1000;
            pulsa = pulsa - 30000;
            point += ((pulsa/1000) * 2);
        }
        System.out.println("Total Point : " + point);
    }
}
