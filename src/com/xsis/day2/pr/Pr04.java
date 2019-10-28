package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.print("input : ");
        input = in.nextInt();

        if (input >= 1000 && input< 10000){
            System.out.println("Bilangan merupakan 4-digit");
        }else{
            System.out.println("Bilangan tidak merupakan 4-digit");
        }
    }
}
