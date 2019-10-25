package com.xsis.day2.conditions;

import java.util.Scanner;

public class If02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("input : ");
        n = in.nextInt();

        if(n % 2 == 0){
            System.out.println("Genap");
        }else{
            System.out.println("Ganjil");
        }
    }
}
