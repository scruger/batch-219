package com.xsis.day4.pr;

import java.util.Scanner;

public class prdini04 {
    public static void main(String[] args) {
        int input, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Enter a number (-99 to quit): ");
            input = scan.nextInt();
            if(input>max){
                max = input;
            } if(input<min && input!=-99){
                min = input;
            }
        }
        while(input!=-99);
        System.out.println("The largest number is: "+max);
        System.out.println("The least number is: "+min);
    }
}
