package com.xsis.day3.quiz3;

import java.util.Scanner;

public class Quiz01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, input = 0, sum = 0, temp = 0;
        double avg;
        System.out.print("Enter N numbers : ");
        i = in.nextInt();
        temp = i;
        while(i > 0){
            System.out.print("Enter Value : ");
            input = in.nextInt();
            sum += input;
            i--;
        }

        avg = sum / (double)temp;

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);

    }
}
