package com.xsis.day2.strings;

public class String02 {

    public static void main(String[] args) {
        String s = "Hello Java World";
        String reverse = "";
        System.out.println(s);
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        s = rev.toString();
        System.out.println(s);

        for (int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        System.out.println("Reverse : "+ reverse);

    }
}
