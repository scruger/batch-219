package com.xsis.day3.pretest;

import java.util.Scanner;

public class Wh06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, sum = 0, i = 1;
        while(i <= 5){
            System.out.print("Enter input : ");
            input = in.nextInt();
            if ((input % 2) == 0){
                sum += input;
            }
            i++;
        }
        System.out.println("Sum : " + sum);


    }
}
