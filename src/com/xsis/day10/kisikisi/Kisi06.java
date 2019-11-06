package com.xsis.day10.kisikisi;

import java.util.Random;
import java.util.Scanner;

public class Kisi06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, player = 0;
        int rand = 0;
        System.out.println("1. Player Main Dahulu");
        System.out.println("2. Computer Main Dahulu (angka rahasia)");
        System.out.print("Masukkan Input : ");
        input = in.nextInt();


        Random r = new Random();
        int randum = r.nextInt(10);
        //System.out.println(randum);

        switch (input){
            case 1:
                System.out.println("----- Player Main Dahulu -----");
                System.out.print("Masukkan Angka Player : ");
                player = in.nextInt();
                rand = (int)(Math.random() * 9.9);
                System.out.println("Angka Komputer Adalah : " + rand);
                if (player > rand){
                    System.out.println("You Win");
                }else{
                    System.out.println("You Lose");
                }
                break;
            case 2:
                System.out.println("----- Computer Main Dahulu -----");
                rand = (int)(Math.random() * 9.9);
                System.out.println("Komputer Sudah Main");
                System.out.print("Masukkan Angka Player : ");
                player = in.nextInt();
                System.out.println("Angka Komputer Adalah : " + rand);
                if (player >rand) {
                    System.out.println("You Win");
                }else{
                    System.out.println("You Lose");
                }

                break;
        }
    }

}
