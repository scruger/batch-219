package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 0;
        System.out.print("input month : ");
        month = in.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Month Unidentified");
        }
    }
}
