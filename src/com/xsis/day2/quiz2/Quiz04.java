package com.xsis.day2.quiz2;

import java.util.Scanner;

public class Quiz04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input String : ");
        String input = in.nextLine();
        System.out.println("======================");

        if(input.length() <= 20){
            System.out.println("Length : " + input.length());
        }else{
            System.out.println("Many Characters");
        }
    }
}
