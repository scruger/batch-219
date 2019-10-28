package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, digit = 0;
        System.out.print("input : ");
        input = in.nextInt();

        // Solution 1
        if ((input) > 0) {
            digit++;
        }
        if ((input / 10) > 0) {
            digit++;
        }
        if ((input / 100) > 0){
            digit++;
        }
        System.out.println("You entered a " + digit + "-digit number");

        // Solution 2
        /*if ((input / 100) > 0){
            System.out.println("You entered a 3-digit number");
        }else if ((input / 10 > 0)){
            System.out.println("You entered a 2-digit number");
        }else{
            System.out.println("You entered a 1-digit number");
        }*/

        // Solution 3
        /*while (input > 0){
            input = input /10;
            digit++;
        }
        System.out.println("You entered a " + digit + "-digit number");*/


    }
}
