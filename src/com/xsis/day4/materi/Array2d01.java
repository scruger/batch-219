package com.xsis.day4.materi;

public class Array2d01 {

    public static void main(String[] args) {
        String[][] grades = new String[2][3];
        grades[0][0] = "A";
        grades[0][1] = "B+";
        grades[0][2] = "B-";
        grades[1][0] = "A++";
        grades[1][1] = "F";
        grades[1][2] = "D";

        //System.out.println(grades[1][2]);

        for (int i = 0; i < grades.length; i++) {
           // System.out.println(i + " length kolom : " + grades[i].length);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
