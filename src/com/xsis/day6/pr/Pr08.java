package com.xsis.day6.pr;

import java.util.Scanner;

public class Pr08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, count = 0;
        System.out.print("input range : ");
        input = in.nextInt();

        for (int i = 1; i < input; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if(i == 1){
                System.out.print(i +", ");
            }
            if(count == 2){
                System.out.print(i + ", ");
            }
        }
    }
}
