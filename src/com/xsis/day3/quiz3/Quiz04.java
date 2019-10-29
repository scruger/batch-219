package com.xsis.day3.quiz3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        String save = "";

        //Solution 1
        do{
            System.out.print("Enter Value : ");
            input = in.nextInt();
            if(input != 0){
                save += (input + " ");
            }
        }
        while (input != 0);

        System.out.println("===================");
        System.out.println(save);


        // Solution 2
        /*List<Integer> val = new ArrayList();
        do {
            System.out.print("Enter Value : ");
            input = in.nextInt();
            if (input != 0){
                val.add(input);
            }
        }while (input != 0);

        System.out.println(val);*/

    }
}
