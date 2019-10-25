package com.xsis.day2.strings;

import java.util.Scanner;

public class String07 {



    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String input = "xsismitra", result;
        System.out.println("Username : " + input);
        //input = in.nextLine();

        int ra = (100 + (int)(Math.random() * 100));

        result = input.substring(0,4) + ra;
        System.out.println(result);


    }
}
