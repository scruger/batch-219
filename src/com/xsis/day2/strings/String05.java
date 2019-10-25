package com.xsis.day2.strings;

public class String05 {

    public static void main(String[] args) {
        String s = "Hello Java Programmer";
        System.out.println("Length : " + s.length());

        // serach position index
        System.out.println("index : " + s.indexOf("Java"));

        // substring untuk get sebuah string dari index ke-i s/d index ke-j
        System.out.println("substring : " + s.substring(6,10));
    }
}
