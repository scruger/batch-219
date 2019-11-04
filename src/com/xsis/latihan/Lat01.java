package com.xsis.latihan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Lat01 {

    public static void main(String[] args) {
        String input = "", reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        input = scan.nextLine();
        for (int i = input.length()-1; i >=0; i--) {
            reverse += input.charAt(i);
        }

            if (input.equals(reverse)) {
                System.out.println("Ini adalah Kata Palindrome");
            } else  {
                System.out.println("Bukan Palindrome");
            }

        }

}
