package com.xsis.day2.conditions;

import java.util.Scanner;

public class If04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;
        char grade = ' ';

        System.out.print("Input Score : ");
        score = in.nextInt();
        if(score >= 90){
            grade = 'A';
        }else if(score < 90){
            grade = 'C';
        }

        System.out.println("Grade : " + grade);

    }
}
