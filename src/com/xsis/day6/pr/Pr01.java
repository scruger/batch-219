package com.xsis.day6.pr;

import java.util.Scanner;

public class Pr01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "", reverse = "";
        System.out.print("input : ");
        input = in.nextLine();

        for (int i = input.length()-1; i >= 0 ; i--) {
            reverse += input.charAt(i);
        }

        if (input.equals(reverse)){
            System.out.println("Kalimat " + input + " adalah palindrome");
        }else{
            System.out.println("Kalimat " + input + " tidak merupakan palindrome");
        }

    }
}
