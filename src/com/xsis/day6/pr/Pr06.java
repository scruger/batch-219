package com.xsis.day6.pr;

import java.util.Scanner;

public class Pr06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, j =0;
        System.out.print("input : ");
        input = in.nextInt();

        for (int i = 0; i <= input; i++) {
            j = i * -1;
            System.out.print(i + "," + j + ", ");
        }


    }
}
