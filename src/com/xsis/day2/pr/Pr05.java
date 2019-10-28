package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputA = 0, inputB = 0;
        System.out.print("input A : ");
        inputA = in.nextInt();
        System.out.print("input B : ");
        inputB = in.nextInt();

        if (inputA > inputB){
            System.out.println("Bilangan yang lebih kecil : " + inputB);
        }else{
            System.out.println("Bilangan yang lebih kecil : " + inputA);
        }
    }
}
