package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        System.out.print("Input : ");
        input = in.next();
        String temp = input.toUpperCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == temp.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
