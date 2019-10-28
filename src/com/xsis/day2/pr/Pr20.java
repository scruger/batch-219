package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr20 {

    static final int pin = 1234;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int verPin = 0, amount = 0, count = 0, note10 = 0, note5 = 0, note1 = 0, sisa = 0;
        String output = " ";

        while(verPin != pin && count < 3) {
            System.out.print("input Pin : ");
            verPin = in.nextInt();
            if(verPin == pin) {
                System.out.print("Enter Amount : ");
                amount = in.nextInt();

                if (amount > 10) {
                    note10 = amount / 10;
                    sisa = amount % 10;
                    output = note10 + "-notes of $10 ";
                }else if (amount > 5){
                    note5 = amount / 5;
                    sisa = amount % 5;
                    output = note5 + "-note of $5 ";
                }else{
                    note1 = amount;
                    output = note1 + "-notes of $1 ";
                }

                if (sisa >= 5) {
                    note5 = sisa / 5;
                    sisa = sisa % 5;
                    output += note5 + "-note of $5 ";
                }

                if (sisa >= 1) {
                    note1 = sisa;
                    output += note1 + "-notes of $1";
                }
                System.out.println(output);
            }
            count++;
            if(count == 3){
                System.out.println("PIN locked");
            }
        }






        /*System.out.print("Enter Amount : ");
        amount = in.nextInt();

        if (amount > 10){
            note10 = amount/10;
            sisa = amount % 10;
            output = note10 + " notes of $10 ";
            if (sisa >= 5){
                note5 = sisa /10;
                sisa = sisa % 10;
                output = note5 + " note of $5 ";
                if (sisa >= 1){
                    note1 = sisa;
                    output = note1 + " notes of $1 ";
                }
            }
        }
        System.out.println(output);*/

    }

}
