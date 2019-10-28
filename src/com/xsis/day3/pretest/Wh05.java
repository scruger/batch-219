package com.xsis.day3.pretest;

import java.util.Scanner;

public class Wh05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double multipli = 1, input = 0;
        int i = 0;
        while(i <= 3){
            System.out.println("Input Number : ");
            input = in.nextInt();
            multipli *= input;
            i++;
        }

        System.out.println("Multiplication : " + multipli);

    }
}
