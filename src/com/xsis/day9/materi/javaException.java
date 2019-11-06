package com.xsis.day9.materi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class javaException {

    public static void main(String[] args) {
        int a, b, c;
        b = 5;
        try{
            a = b/0;
        }catch (ArithmeticException e){
            System.out.println("Error : " + e.toString());
        }

        Scanner in = new Scanner(System.in);
        try{
            System.out.print("input Number : ");
            int x = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.toString());
        }
    }
}
