package com.xsis.day2.pr;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Prtest {

    static String convert(char a){
        String word = " ";
        switch (a){
            case '0':
                word = "zero";
                break;
            case '1':
                word = "one";
                break;
            case '2':
                word = "two";
                break;
            case '3':
                word = "three";
                break;
            case '4':
                word = "four";
                break;
            case '5':
                word = "five";
                break;
            case '6':
                word = "six";
                break;
            case '7':
                word = "seven";
                break;
            case '8':
                word = "eight";
                break;
            case '9':
                word = "nine";
                break;
        }
        return word;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = " ";
        char a, b;
        System.out.print("Input : ");
        input = in.next();

        a = input.charAt(0);
        b = input.charAt(2);
        System.out.println(convert(a) + " point " + convert(b));

    }

}
