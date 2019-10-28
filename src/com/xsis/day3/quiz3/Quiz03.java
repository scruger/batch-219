package com.xsis.day3.quiz3;

import java.util.Scanner;

public class Quiz03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 5, input = 0, sum = 0;
        while(i > 0){
            System.out.print("Enter Value : ");
            input = in.nextInt();
            if (input / 100 > 0){
                sum += input;
            }
            i--;
        }
        System.out.println("Sum of Three-digit integers : " + sum);

    }
}
