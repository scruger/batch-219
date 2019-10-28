package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int miles = 0, nextServiceMinor = 0, nextServiceMajor = 0;
        System.out.print("Enter Miles Traveled : ");
        miles = in.nextInt();

        nextServiceMinor = 6000 - (miles % 6000);
        nextServiceMajor = 12000 - (miles % 12000);

        if (nextServiceMinor == 6000 && nextServiceMajor == 12000){
            System.out.println("Finished Minor Service");
            System.out.println("Finished Major Service");
        }else if (nextServiceMinor == 6000){
            System.out.println("Finished Minor Service");
            System.out.println(nextServiceMajor + " miles left until next Major Service");
        }else {
            System.out.println(nextServiceMinor + " miles left until next Minor Service");
            System.out.println(nextServiceMajor + " miles left until next Major Service");
        }

    }
}
