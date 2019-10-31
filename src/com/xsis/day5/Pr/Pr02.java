package com.xsis.day5.Pr;

import java.util.Scanner;

public class Pr02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int temp1 = 0, temp2 = 0;
        String[] pimpah = {"rock", "paper", "scissor"};
        System.out.print("Enter rock, paper or scissor : ");
        input = in.nextLine();

        for (int i = 0; i < pimpah.length; i++) {
            if (pimpah[i].equals(input)){
                temp1 = i;
                //System.out.println("temp1 : " + temp1);
            }
        }

        temp2 = (int)((Math.random()) * 3);
        System.out.print("Computer's Choice : " + pimpah[temp2]);
        //System.out.println("\ntemp2 : " + temp2);
        //System.out.println(temp1);
        for (int i = 0; i < pimpah.length; i++) {
            for (int j = 0; j < pimpah.length; j++) {
                if (i == temp1 && j == temp2) {
                    if (i == j ) {
                        System.out.println("\n You Draw" + " ");
                    } else if ((i == 0 && j == 1) || (i == 1 && j == 2) || (i == 2 && j == 0)) {
                        System.out.println("\nYou Lose" + " ");
                    } else {
                        System.out.println("\nYou   Win" + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
