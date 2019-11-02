package com.xsis.day6.pr;

import java.util.Scanner;

public class Pr04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int size = 0, ram  = 1;
        System.out.print("input ram size : ");
        size = in.nextInt();
        while(ram <= size){
            /*if (ram == 0) {
                ram++;
                i++;
                continue;
            }*/
            System.out.print(ram + ", ");
            ram = (int)(Math.pow(2,i));
            i++;
        }
    }
}
