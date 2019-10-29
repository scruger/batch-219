package com.xsis.day4.materi;

public class Array01 {

    public static void main(String[] args) {
        // inisialisasi array
        String[] grade = new String[4];
        grade[0] = "Hello";
        grade[1] = "Java";
        grade[2] = "Dev";
        grade[3] = "World";

        // loop for to display array value
        for (int i = 0; i < grade.length; i++) {
            System.out.print(grade[i] + " ");
            }

        // search value in array
        for (int i = 0; i < grade.length; i++) {
            if(grade[i] == "Java"){
                System.out.println("\nfound index ke : " + i);
                }
            }

    }
}
