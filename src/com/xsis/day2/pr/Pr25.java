package com.xsis.day2.pr;

import java.util.Scanner;

public class Pr25 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double weight , total;
        String destination = " ";
        System.out.print("input weight : ");
        weight = in.nextInt();
        System.out.print("destination : ");
        destination = in.next().toUpperCase();

        if (weight < 1){
            if (destination.equals("I")){
                total = weight * 0.01;
                System.out.println("Shipping Cost inside country : " + total);
            }else{
                total = weight * 10;
                System.out.println("Shipping Cost outside country : " + total);
            }
        }else if (weight >= 1 && weight < 2){
            if (destination.equals("I")){
                total = weight * 0.013;
                System.out.println("Shipping Cost inside country : " + total);
            }else{
                total = weight * 20;
                System.out.println("Shipping Cost outside country : " + total);
            }
        }else if (weight >= 2 && weight < 4) {
            if (destination.equals("I")) {
                total = weight * 0.015;
                System.out.println("Shipping Cost inside country : " + total);
            } else {
                total = weight * 50;
                System.out.println("Shipping Cost outside country : " + total);
            }
        }else if (weight >= 4){
            if (destination.equals("I")){
                total = weight * 0.020;
                System.out.println("Shipping Cost inside country : " + total);
            }else{
                total = weight * 60;
                System.out.println("Shipping Cost outside country : " + total);
            }
        }
    }

}

