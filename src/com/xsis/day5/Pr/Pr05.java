package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "saveChangesInTheEditor";
        String tempUp = input.toUpperCase();
        String tempLow = input.toLowerCase();
        int awal = 0, sisa = 0, count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))){
                count++;
            }
        }
        if (Character.isLowerCase(input.charAt(0))){
            count++;
        }
        System.out.println(count);
        //System.out.println(input.substring(awal,input.length()));
    }
}
