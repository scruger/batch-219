package com.xsis.day2.strings;

public class String04 {

    public static void main(String[] args) {
        String s, st;
        s = "Hello .NET Developer Welcome to Xsis Academy";
        System.out.println(s);

        //replace
        st = s.replace(".NET", "JAVA");
        st = st.replace("Welcome", "Hello");
        System.out.println(st);
        st = s.replace(".NET", "JAVA")
                .replace("Welcome", "Aloha")
                .replace("Xsis Academy", "XA");
        System.out.println(st);

        //to UPPERCASE to Lowercase
        st = st.toUpperCase();
        System.out.println(st);

        st = st.toLowerCase();
        System.out.println(st);

    }
}
