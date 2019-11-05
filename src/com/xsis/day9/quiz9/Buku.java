package com.xsis.day9.quiz9;

import java.util.Scanner;

public class Buku {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String isMember = "";
        System.out.println("Apakah Member ? Y/N");
        isMember = in.next();
        if (isMember.equals("Y")){

        }else{
            System.out.println("Bukan Member");
        }
    }

}
