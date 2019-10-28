package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr17 {

    static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = " ";
        System.out.print("input : ");
        input = in.next();

        if (input.matches(IS_NUMERIC)){
            System.out.println("Inputan Bilangan Numeric");
            if (Integer.parseInt(input) % 5 == 0 && Integer.parseInt(input) % 8 == 0){
                System.out.println(input + " is divisible by 5 and 8");
            }else {
                System.out.println(input + " is NOT divisible by 5 and 8");
            }
        }else{
            System.out.println("Inputan Bukan Bilangan Numeric");
        }


    }
}
