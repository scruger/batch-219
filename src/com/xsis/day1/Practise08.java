package com.xsis.day1;

import java.util.Scanner;

//konversi dari farenheit ke kelvin
//rumus kelvin = (farenheit + 459.67)/1.8
//

public class Practise08 {

    static final double cf = 459.67;
    static final double cd = 1.8;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double farenheit = 0, kelvin = 0;
        System.out.print("Input temperature in Farenheit : ");
        farenheit = scan.nextDouble();
        kelvin = (farenheit + cf)/cd;
        System.out.println("After Conversion to Kelvin : " + kelvin);

    }
}
