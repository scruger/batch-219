package com.xsis.day2.strings;

public class String06 {

    public static void main(String[] args) {
        String s, st;
        s = "HELLO JAVA PROGRAMMER";
        st = s.substring(11,21) +" "+ s.substring(0,5) +" "+ s.substring(6,10);
        System.out.println(st);

    }
}
