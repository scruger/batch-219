package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.print("Input : ");
        input = in.nextInt();

        if ((input % 6) == 0 ){
            System.out.println("Bilangan merupakan kelipatan 6");
        }else{
            System.out.println("Bilangan tidak merupakan kelipatan 6");
        }

    }
}
