package com.xsis.day4.quiz4;

import java.util.Scanner;

public class Quiz09 {

    static void init(String[] kata){
        Scanner in = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < kata.length; i++) {
            System.out.print("Input kata index ke-" + i + " : ");
            input = in.nextLine();
            kata[i] = input;
        }
    }

    static void displayWordTen(String[] kata){
        System.out.println("\nKata yang setidaknya memiliki 10 huruf");
        for (int i = 0; i < kata.length; i++) {
            if (kata[i].length() >= 10){
                System.out.println("Kata : " + kata[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] kata = new String[3];
        init(kata);
        displayWordTen(kata);
    }
}
