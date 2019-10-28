package com.xsis.day3.quiz3;

import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, input = 0, sum = 0;
        System.out.print("Enter N numbers : ");
        i = in.nextInt();
        while(i > 0){
            System.out.print("Enter Value : ");
            input = in.nextInt();
            if (input % 2 == 0){
                sum += input;
            }
            i--;
        }
        System.out.println("Sum : " + sum);
    }
}
