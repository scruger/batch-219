package com.xsis.day4.materi;

public class Array2d02 {

    public static void main(String[] args) {
        String[][] grades = {{"A", "B+", "B-"},
                {"A++", "F", "D"},
                {"C", "D", "E"},
                {"X", "Y", "Z"}};

        for (int i = 0; i < grades.length; i++) {
            // System.out.println(i + " length kolom : " + grades[i].length);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
