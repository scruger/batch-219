package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input String : ");
        String input = in.nextLine();
        System.out.println("======================");

        if (input.equals(input.toUpperCase())){
            System.out.println("Uppercase");
        }else{
            System.out.println("Not Uppercase");
        }
    }
}
