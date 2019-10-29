package com.xsis.day4.quiz4;

import java.util.Scanner;

public class Quiz10 {

    static void init(String[] kata){
        Scanner in = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < kata.length; i++) {
            System.out.print("Input kata index ke-" + i + " : ");
            input = in.nextLine();
            kata[i] = input;
        }
    }

    static void displayWordContainW(String[] kata){
        System.out.println("\nKata yang setidaknya memiliki 2 huruf 'w' ");
        int count = 0;
        for (int i = 0; i < kata.length; i++) {
            count = 0;
            for (int j = 0; j < kata[i].length(); j++) {
                if (kata[i].charAt(j) == 'w'){
                    count++;
                }
            }
            //System.out.println(count);
            if (count >= 2){
                System.out.println("Kata : " + kata[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] kata = new String[3];
        init(kata);
        displayWordContainW(kata);
    }
}
