package com.xsis.day1;

import java.util.Scanner;

public class Practise05 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double litterPerKilo = 0, totalJarakTempuh = 0, totalLiter = 0;
        System.out.print("Total Jarak ditempuh : ");
        totalJarakTempuh = scan.nextDouble();
        System.out.print("Total Bensin yang dipakai : ");
        totalLiter = scan.nextDouble();

        //calculate satu liter per kilo nya
        litterPerKilo = totalJarakTempuh / totalLiter;
        System.out.println("Satu Litter Per Kilo : " + litterPerKilo);
    }
}
