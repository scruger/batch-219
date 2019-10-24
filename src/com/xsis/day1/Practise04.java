package com.xsis.day1;

/* rumus Luas Lingkaran
* area = pi * (r*r)
* pi = 3.14
 */
import java.util.Scanner;

public class Practise04 {

    // deklarasi variable final pi
    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = 0, radius = 0;
        System.out.print("Radius : ");
        radius = scan.nextDouble();
        // calculate
        area = pi * (radius * radius);
        System.out.println("Luas Lingkaran: " +area);

    }
}
