package com.xsis.day4.pr;

import java.util.Scanner;

public class Pr05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int budget = 0, cost = 0, i = 1, sum = 0;
        System.out.print("Enter your monthly budget : $");
        budget = in.nextInt();
        System.out.println("Money spent this month (type -1 to quit:");
        System.out.println("----------------------------------------");


        do{
            System.out.print("Enter cost #" + i + ": ");
            cost = in.nextInt();
            if (cost != (-1)){
                sum += cost;
            }
            i++;
        }while(cost != -1);
        budget = budget - sum;
        System.out.println("Total costs: $" + sum);
        System.out.println("You are $" + budget + " under your budget.");
    }
}
