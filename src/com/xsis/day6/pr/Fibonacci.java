package com.xsis.day6.pr;

import java.util.Scanner;

/*Wirite a java program that display Fibonacci 2 sequence :
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …*/

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = 0, indexA = 0, indexB = 1, sum = 1;
        System.out.print("input range : ");
        range = in.nextInt();

        while(sum <= range){
            System.out.println("sum : " + sum);
            sum = indexA + indexB;
            indexA = indexB;
            indexB = sum;

        }
    }
}
