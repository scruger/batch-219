package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "saveChangesInTheEditor";
        String temp = input.toUpperCase();
        int awal = 0, sisa = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == temp.charAt(i)){
                sisa = awal;
                System.out.println(input.substring(awal,i));;
                awal = i;
            }
        }
        //System.out.println(input.substring(awal,input.length()));
    }
}
