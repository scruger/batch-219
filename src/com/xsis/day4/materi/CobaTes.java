package com.xsis.day4.materi;

import java.util.Scanner;

public class CobaTes {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cob = "";
        cob = "t".toUpperCase();

        while(cob.equals("T")){
            System.out.print("Enter Word : ");
            cob = in.nextLine().toUpperCase();
        }

        if(cob.equals("T")){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}
