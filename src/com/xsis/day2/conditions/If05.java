package com.xsis.day2.conditions;

import java.util.Scanner;

public class If05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        System.out.print("Input hari dalam angka : ");
        day = in.nextInt();

        // gunakan case

        switch(day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thrusday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Doomsday");
                break;
        }
    }
}
