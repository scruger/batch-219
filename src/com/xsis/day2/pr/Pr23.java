package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weightA, weightB, weightC;
        System.out.print("Weight Person 1 : ");
        weightA = in.nextInt();
        System.out.print("Weight Person 2 : ");
        weightB = in.nextInt();
        System.out.print("Weight Person 3 : ");
        weightC = in.nextInt();

        if (weightA > weightB && weightA > weightC){
                System.out.println("Person 1 is the heaviest person");
        }else if (weightB > weightC && weightB > weightA){
                System.out.println("Person 2 is the heaviest person");
        }else {
            System.out.println("Person 3 is the heaviest person");
        }
    }
}
