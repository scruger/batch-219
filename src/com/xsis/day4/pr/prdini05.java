package com.xsis.day4.pr;

import java.util.Scanner;

public class prdini05 {
    public static void main(String[] args) {
        int budget, value, total=0, residu, i=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your monthly budget: ");
        budget = scan.nextInt();
        System.out.println("Money spent this month (type -1 to quit: )");
        System.out.println("----------------------------------------");
        do{
            System.out.print("Enter cost #"+i+ " : ");
            value = scan.nextInt();
            if(value!=-1){
                total = total+value;
            }
        } while(value!= -1);
        System.out.println("Total costs: $"+total);
        residu = budget - total;
        System.out.println("You are "+residu+" under your budget.");
    }
}
