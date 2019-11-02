package com.xsis.day6.pr;

import java.util.Scanner;

public class Pr07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seq = 1, input = 0;
        System.out.print("input : ");
        input = in.nextInt();

        while (seq <= input){
            System.out.print(seq + ", ");
            seq = (seq * 10) + 1;
        }


    }
}
