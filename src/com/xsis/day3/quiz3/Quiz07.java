package com.xsis.day3.quiz3;

import java.util.Scanner;

public class Quiz07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int count = 1;
        System.out.print("input String : ");
        input = in.nextLine();
        if (input.length() == 0){
           count = 0;
        }
        int i = 0;

        while(i < input.length()){
            if (input.charAt(i) == ' '){
                count++;
            }
            i++;
        }
        System.out.println("The message entered contain " + count + " words");

    }
}
