package com.xsis.day4.pr;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        do{
            System.out.print("Enter a number (-99 to quit) : ");
            input = in.nextInt();
            if (input > max){
                max = input;
            }
            if (input < min && input != -99){
                min = input;
            }
        }
        while(input != (-99));

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
